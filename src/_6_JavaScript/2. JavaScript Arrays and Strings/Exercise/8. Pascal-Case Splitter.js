function solve(text){
   const reg = /[A-z]{1}[a-z]+/g
   const maches = text.matchAll(reg)
   let otput = []

   for (const word of maches) {
      otput.push(word);
   }

   console.log(otput.join(", "));
}

solve('SplitMeIfYouCanHaHaYouCantOrYouCan')