function solve (yields){
   let toExtract = yields;
   let days = 0;
   let left = -26;
   let consumed = 0;

   while (toExtract >= 100){
      days += 1;
      left += toExtract - 26;
      consumed += 26
      toExtract -= 10;
   }

   if(left < 0){
      left = 0;
   }
   console.log(days);
   console.log(left);
}