function tickets(typeOfDay, age){
   if(age < 0){
      console.log('Error!')
      return;
   }
   
   switch(typeOfDay) {
      case 'Weekday':
         if(age >= 0 && age <= 18){
            console.log('12$');
         }else if(age <= 64) {
            console.log('18$');
         }else if(age <= 122){
            console.log('12$');
         }
         break;

      case 'Weekend':
         if(age >= 0 && age <= 18){
            console.log('15$');
         }else if(age <= 64) {
            console.log('20$');
         }else if(age <= 122){
            console.log('15$');
         }
         break;

      case 'Holiday':
         if(age >= 0 && age <= 18){
            console.log('5$');
         }else if(age <= 64) {
            console.log('12$');
         }else if(age <= 122){
            console.log('10$');
         }
      break;
   } 
}

tickets('Holiday',-12)