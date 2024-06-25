function solve(speed, area){
   const one = 'speeding';
   const two = 'excessive speeding';
   
   switch (area) {
      case 'motorway':
         if(speed > 130){
            let diff = speed-130;
            if(diff <= 20){
               console.log(`The speed is ${diff} km/h faster than the allowed speed of 130 - ${one}`)
            }else{
               console.log(`The speed is ${diff} km/h faster than the allowed speed of 130 - ${two}`)
            }
         }else {
            console.log(`Driving ${speed} km/h in a 130 zone`)
         }
         break;
      case 'interstate':
         if(speed > 90){
            let diff = speed-90;
            if(diff <= 20){
               console.log(`The speed is ${diff} km/h faster than the allowed speed of 90 - ${one}`)
            }else{
               console.log(`The speed is ${diff} km/h faster than the allowed speed of 90 - ${two}`)
            }
         }else {
            console.log(`Driving ${speed} km/h in a 90 zone`)
         }
         break;
      case 'city':
         if(speed > 50){
            let diff = speed-50;
            if(diff <= 20){
               console.log(`The speed is ${diff} km/h faster than the allowed speed of 50 - ${one}`)
            }else{
               console.log(`The speed is ${diff} km/h faster than the allowed speed of 50 - ${two}`)
            }
         }else {
            console.log(`Driving ${speed} km/h in a 50 zone`)
         }
         break;
      case 'residential':
         if(speed > 20){
            let diff = speed-20;
            if(diff <= 20){
               console.log(`The speed is ${diff} km/h faster than the allowed speed of 20 - ${one}`)
            }else{
               console.log(`The speed is ${diff} km/h faster than the allowed speed of 20 - ${two}`)
            }
         }else {
            console.log(`Driving ${speed} km/h in a 20 zone`)
         }
         break;
   }
}
