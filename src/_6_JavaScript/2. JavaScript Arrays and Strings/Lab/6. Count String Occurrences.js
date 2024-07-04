function solve(input, wordToSearch){
   const text = input.split(" ");
   let count = 0;
   for (const word of text) {
      if (word == wordToSearch){
         count++;
      }
   }
   console.log(count);
}