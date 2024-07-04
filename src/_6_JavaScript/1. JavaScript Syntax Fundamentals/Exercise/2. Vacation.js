function vacation(group, type, weekDay){
   let price = 0;

   switch(type) {
      case 'Students':
         one(group, weekDay)
         break;

      case 'Business':
         two (group, weekDay);
         break;

      case 'Regular':
         three(group, weekDay)
         break
   }
}




function one (group, weekDay){
   if (weekDay == 'Friday'){
      price = group * 8.45;
   }else if (weekDay == 'Saturday'){
      price = group * 9.80;
   }else{
      price = group * 10.46;
   }

   if (group >= 30){
      price = price * 0.85;
   }
   console.log(`Total price: ${price.toFixed(2)}`)
}

function two (group, weekDay){
   let  price = 0;
   if (group >= 100){
      if (weekDay == 'Friday'){
         price = (group - 10) * 10.90;
      }else if (weekDay == 'Saturday'){
         price = (group - 10) * 15.60;
      }else{
         price = (group - 10) * 16;
      }
   }else {
      if (weekDay == 'Friday'){
         price = group * 10.90;
      }else if (weekDay == 'Saturday'){
         price = group * 15.60;
      }else{
         price = group * 16;
      }
   }

   console.log(`Total price: ${price.toFixed(2)}`)
}
   
      
function three (group, weekDay){
   if (weekDay == 'Friday'){
      price = group * 15;
   }else if (weekDay == 'Saturday'){
      price = group * 20;
   }else{
      price = group * 22.5;
   }

   if (group >= 10 && group <= 20){
      price = price * 0.95;
   }
   console.log(`Total price: ${price.toFixed(2)}`)
}

