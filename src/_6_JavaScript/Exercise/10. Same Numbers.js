function nums(num) {
   let sum = 0;
   let allSame = true;
   const numStr = String(num);
   
   for (let i = 0; i < numStr.length; i++) {
       sum += Number(numStr.charAt(i));
       if (i > 0 && numStr.charAt(i) !== numStr.charAt(i - 1)) {
           allSame = false;
       }
   }

   console.log(allSame);
   console.log(sum);
}