function leap (year){
   if (year % 100 != 0  && year % 4 == 0){
      console.log('yes');
   }else if (year % 400 == 0){
      console.log('yes');
   }else{
      console.log('no');
   }
}

leap(1900)
