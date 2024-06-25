function radius(argument){
   let type = typeof(argument);

   if(type == "number"){
      let rad = argument ** 2;
      console.log( (Math.PI * rad).toFixed(2));
   }else {
      console.log(`We can not calculate the circle area, because we receive a ${typeof(argument)}.`)
   }
   
}

radius(5);