function solve(wordsToFind, template){
   const array = wordsToFind.split(", ");

   for (const word of array) {
      const graph = `*`.repeat(word.length);
      template = template.replace(graph, word)
   }
   console.log(template);
}

solve('great',
'softuni is ***** place for learning new programming languages'
)
