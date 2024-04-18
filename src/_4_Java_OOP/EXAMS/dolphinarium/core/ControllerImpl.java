package _4_Java_OOP.EXAMS.dolphinarium.core;

import _4_Java_OOP.EXAMS.dolphinarium.entities.dolphins.BottleNoseDolphin;
import _4_Java_OOP.EXAMS.dolphinarium.entities.dolphins.Dolphin;
import _4_Java_OOP.EXAMS.dolphinarium.entities.dolphins.SpinnerDolphin;
import _4_Java_OOP.EXAMS.dolphinarium.entities.dolphins.SpottedDolphin;
import _4_Java_OOP.EXAMS.dolphinarium.entities.foods.Food;
import _4_Java_OOP.EXAMS.dolphinarium.entities.foods.Herring;
import _4_Java_OOP.EXAMS.dolphinarium.entities.foods.Mackerel;
import _4_Java_OOP.EXAMS.dolphinarium.entities.foods.Squid;
import _4_Java_OOP.EXAMS.dolphinarium.entities.pools.DeepWaterPool;
import _4_Java_OOP.EXAMS.dolphinarium.entities.pools.Pool;
import _4_Java_OOP.EXAMS.dolphinarium.entities.pools.ShallowWaterPool;
import _4_Java_OOP.EXAMS.dolphinarium.repositories.FoodRepository;
import _4_Java_OOP.EXAMS.dolphinarium.repositories.FoodRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;

import static _4_Java_OOP.EXAMS.dolphinarium.common.ConstantMessages.SUCCESSFULLY_ADDED_POOL_TYPE;
import static _4_Java_OOP.EXAMS.dolphinarium.common.ConstantMessages.SUCCESSFULLY_BOUGHT_FOOD_TYPE;
import static _4_Java_OOP.EXAMS.dolphinarium.common.ExceptionMessages.*;

public class ControllerImpl implements Controller {

    private FoodRepository foodRepository;
    private Collection<Pool> pools;

    public ControllerImpl() {
        this.foodRepository = new FoodRepositoryImpl();
        this.pools = new ArrayList<>();
    }

    @Override
    public String addPool(String poolType, String poolName) {
        for (Pool pool : pools) {
            if (pool.getName().equals(poolName)) {
                throw new NullPointerException(POOL_EXISTS);
            }
        }

        Pool pool;
        if (poolType.equals("DeepWaterPool")) {
            pool = new DeepWaterPool(poolName);
        } else if (poolType.equals("ShallowWaterPool")) {
            pool = new ShallowWaterPool(poolName);
        } else {
            throw new NullPointerException(INVALID_POOL_TYPE);
        }

        this.pools.add(pool);
        return String.format(SUCCESSFULLY_ADDED_POOL_TYPE, poolType, poolName);
    }

    @Override
    public String buyFood(String foodType) {
        Food food;
        if (foodType.equals("Squid")) {
            food = new Squid();
        } else if (foodType.equals("Herring")) {
            food = new Herring();
        } else if (foodType.equals("Mackerel")) {
            food = new Mackerel();
        } else {
            throw new IllegalArgumentException(INVALID_FOOD_TYPE);
        }

        this.foodRepository.add(food);
        return String.format(SUCCESSFULLY_BOUGHT_FOOD_TYPE, foodType);
    }

    @Override
    public String addFoodToPool(String poolName, String foodType) {

        Food food = this.foodRepository.findByType(foodType);
        if (food == null) {
            throw new IllegalArgumentException(String.format(NO_FOOD_FOUND, foodType));
        }

        for (Pool pool : pools) {
            if (pool.getName().equals(poolName)) {
                pool.addFood(food);
                break;
            }
        }

        this.foodRepository.remove(food);
        return String.format("Successfully added %s to %s.", foodType, poolName);

    }

    @Override
    public String addDolphin(String poolName, String dolphinType, String dolphinName, int energy) {
        Pool pool = null;
        for (Pool pool1 : pools) {
            if (pool1.getName().equals(poolName)) {
                pool = pool1;
            }
        }

        assert pool != null;
        for (Dolphin dolphin : pool.getDolphins()) {
            if (dolphin.getName().equals(dolphinName)) {
                throw new IllegalArgumentException("Dolphin already exists.");
            }
        }


        Dolphin dolphin;
        if (dolphinType.equals("BottleNoseDolphin")) {
            dolphin = new BottleNoseDolphin(dolphinName, energy);
            if (pool.getClass().getSimpleName().equals("ShallowWaterPool")) {
                return "This pool is not suitable.";
            }
        } else if (dolphinType.equals("SpottedDolphin")) {
            dolphin = new SpottedDolphin(dolphinName, energy);
            if (pool.getClass().getSimpleName().equals("DeepWaterPool")) {
                return "This pool is not suitable.";
            }
        } else if (dolphinType.equals("SpinnerDolphin")) {
            dolphin = new SpinnerDolphin(dolphinName, energy);
            if (pool.getClass().getSimpleName().equals("DeepWaterPool")) {
                return "This pool is not suitable.";
            }
        } else {
            throw new IllegalArgumentException("Invalid dolphin type.");
        }

        pool.addDolphin(dolphin);
        //this.pools.add(pool);
        return String.format("Successfully added %s %s to %s.", dolphinType, dolphinName, poolName);
    }

    @Override
    public String feedDolphins(String poolName, String food) {

        int fedDolphinsCount = 0;
        Food food1 = null;
        if (food.equals("Squid")) {
            food1 = new Squid();
        } else if (food.equals("Herring")) {
            food1 = new Herring();
        } else if (food.equals("Mackerel")) {
            food1 = new Mackerel();
        }

        Pool pool = null;
        for (Pool pool1 : pools) {
            if (pool1.getName().equals(poolName)) {
                pool = pool1;
            }
        }

        assert pool != null;
        for (Food food2 : pool.getFoods()) {
            if (food1 != food2) {
                throw new IllegalArgumentException("There is no such food for this pool.");
            }
        }

        for (Dolphin dolphin : pool.getDolphins()) {
            fedDolphinsCount++;
            dolphin.eat(food1);
        }

        pool.getFoods().remove(food1);
        return String.format("%d dolphin/s in pool %s was/were fed.", fedDolphinsCount, poolName);
    }

    @Override
    public String playWithDolphins(String poolName) {
        int removedDolphins = 0;

        Pool pool = null;
        for (Pool pool1 : pools) {
            if (pool1.getName().equals(poolName)) {
                pool = pool1;
            }
        }


        assert pool != null;

        if (pool.getDolphins().isEmpty()) {
            throw new IllegalArgumentException("There are no dolphins to play with.");
        }

        for (Dolphin dolphin : pool.getDolphins()) {
            dolphin.jump();
            if (dolphin.getEnergy() <= 0) {
                pool.getDolphins().remove(dolphin);
                removedDolphins++;
            }
        }
        return String.format("There was a play with dolphin/s in %s. %d dolphins was/were removed!",poolName, removedDolphins);
    }

    @Override
    public String getStatistics() {
        StringBuilder statistics = new StringBuilder();

        for (Pool pool : pools) {
            statistics.append("Dolphins in pool ").append(pool.getName()).append(":\n");

            // Check if the pool has dolphins
            if (pool.getDolphins().isEmpty()) {
                statistics.append("none\n");
            } else {
                for (Dolphin dolphin : pool.getDolphins()) {
                    statistics.append(dolphin.getName()).append(" - ").append(dolphin.getEnergy()).append(", ");
                }
                // Remove the last comma and space
                statistics.delete(statistics.length() - 2, statistics.length());
                statistics.append("\n");
            }
        }

        return statistics.toString().trim();
    }
}
