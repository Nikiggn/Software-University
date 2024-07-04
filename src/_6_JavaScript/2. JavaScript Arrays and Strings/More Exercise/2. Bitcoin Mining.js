function solve(input){
   const BitCoin = 11949.16;
   const gold = 67.51;

   let boughtBitcoins = 0;
   let dayOfFirstBought = 0;
   let money = 0;

   for (let day = 1; day <= input.length; day++) {
      if (day % 3 === 0){
         money += Number(input[day - 1] * 0.7 * gold);
      }else{
         money += Number((input[day - 1] * gold));
      }

      if (money >= BitCoin){
         let bitToPurches = Math.floor(money / BitCoin);
         money -= BitCoin * bitToPurches;
         boughtBitcoins += bitToPurches;

         if(dayOfFirstBought === 0){
            dayOfFirstBought = day;
         }
         
      }

   }
   console.log(`Bought bitcoins: ${boughtBitcoins}`)
   console.log(boughtBitcoins > 0 ? `Day of the first purchased bitcoin: ${dayOfFirstBought}\nLeft money: ${money.toFixed(2)} lv.` : `Left money: ${money.toFixed(2)} lv.`);
}

solve([50])