package _4_Java_OOP.EXAMS._14_August_2022.football.entities.field;

import _4_Java_OOP.EXAMS._14_August_2022.football.entities.player.Player;
import _4_Java_OOP.EXAMS._14_August_2022.football.entities.supplement.Supplement;

import java.util.Collection;
import java.util.Collections;

import static _4_Java_OOP.EXAMS._14_August_2022.football.common.ConstantMessages.NOT_ENOUGH_CAPACITY;
import static _4_Java_OOP.EXAMS._14_August_2022.football.common.ExceptionMessages.FIELD_NAME_NULL_OR_EMPTY;

public abstract class BaseField implements Field {
    private String name;
    private int capacity;
    private Collection<Supplement> supplements;
    private Collection<Player> players;


    protected BaseField(String name, int capacity) {
        this.setName(name);
        this.capacity = capacity;
//        this.supplements = new ArrayList<>();
//        this.players = new ArrayList<>();
    }

    public void setName(String name) {
        if (name == null || name.trim().length() < 1) {
            throw new NullPointerException(FIELD_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public int sumEnergy() {
        return this.supplements.stream()
                .mapToInt(Supplement::getEnergy)
                .sum();
    }

    @Override
    public void addPlayer(Player player) {
        if (players.size() < capacity) {
            players.add(player);
        } else {
            throw new IllegalArgumentException(NOT_ENOUGH_CAPACITY);
        }
    }

    @Override
    public void removePlayer(Player player) {
        this.players.remove(player);
    }

    @Override
    public void addSupplement(Supplement supplement) {
        this.supplements.add(supplement);
    }

    @Override
    public void drag() {
        this.players.forEach(Player::stimulation);
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append(String.format("%s (%s):", this.name, this.getClass().getSimpleName())).append(System.lineSeparator());
        info.append(String.format("Player:"));
        if (players.isEmpty()) {
            info.append(" none");
        } else {
            for (Player player : this.players) {
                info.append(String.format(" %s", player.getName()));
            }
        }
        info.append(System.lineSeparator());
        info.append(String.format("Supplement: %d", this.supplements.size())).append(System.lineSeparator());
        info.append(String.format("Energy: %d", this.sumEnergy()));
        return info.toString().trim();
    }

    @Override
    public Collection<Player> getPlayers() {
        return Collections.unmodifiableCollection(players);
    }

    @Override
    public Collection<Supplement> getSupplements() {
        return Collections.unmodifiableCollection(supplements);
    }

    @Override
    public String getName() {
        return name;
    }
}
