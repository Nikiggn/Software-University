function revChars(p1, p2, p3){
   const firtStr = p1 + p2 + p3;
   let newStr = "";
   for (let i = firtStr.length - 1; i >= 0; i--){
      newStr += String(firtStr).charAt(i);
      newStr += ' ';
   }
   console.log(newStr);
}


revChars('A',
'B',
'C'
)