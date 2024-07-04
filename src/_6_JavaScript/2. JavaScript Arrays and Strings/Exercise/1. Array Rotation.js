function solve (arr, rotations){
   const cutOffIndex = rotations % arr.length;

   let leftSide = arr.slice(0, cutOffIndex);
   let rightSide = arr.slice(cutOffIndex);

   let res = rightSide.concat(leftSide);
   console.log(res.join(" "));
}