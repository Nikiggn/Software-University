//First
function solve (n1, arr){
   let text = "";

   for (let i = n1- 1; i >= 0; i--) {
      text += `${arr[i] + " "}`;
   }

   console.log(text)
}
