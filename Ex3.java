class Ex3{

	public String ex3_0(int n){

        if(n>0) {
		return "その値は正です";
        }else {
          return "その値は０か負です";
        }

	}

	public int ex3_1(int n){

        if (n < 0 ){
        return n * -1;
        }else{

            return n;
        }


	}

	public String ex3_2(int a, int b){

	  if(a % b == 0) {
       return b + "は"  + a + "の約数です";
      }else{
          return  b + "は" + a +"の約数ではありません";

      }

  }


	public String ex3_3(int a, int b){

        if(a > b){
          return a + "の方が大きいです";
        }
        else if(b > a){
        return b + "の方が大きいです";
        }else{
        return "同じ値です";
    }
}
	public String ex3_4(int a){

        if(a >= 0){
        if (a % 5 ==0){
           return "その値は5で割り切れます";
        }
           return "その値は5で割り切れません";
        }else{
           return "正でない整数値です";
        }
	}

	public String ex3_5(int a){
      if (a >=0){
      if (a % 10 ==0){
         return "その値は10の倍数です";
      }
        return "その値は10の倍数ではありません";
    }else {
    return "正でない整数値です";
       }
	}

    public String ex3_6(int a){
      if (a >= 0){
        if (a % 3 ==0){
          return "その値は3で割り切れます";
        }
          if(a % 3 ==1){
          return "その値を3で割った余りは1です";
          }
          if(a % 3 ==2){
          return "その値を3で割った余りは2です";
          }
      }
       return "正でない整数値です";
	}

	public String ex3_7(int a){
      if((a >= 0) && (a <= 100)){
      if (a >= 80){
       return "優";
      }else if (a >= 70){
       return "良";
      }else if (a >= 60){
       return "可";
      }else{
        return "不可";
      }
      }
        return "範囲(0～100)外の値です";
	}

	public double ex3_8(double a, double b){
        if (a > b){
           return a;
        }else{
           return b;
        }
    }

	public int ex3_9(int a, int b){
		return Math.abs(a - b);
	}

	public String ex3_10(int a, int b){
		int x = Math.abs(a - b);
         if(x > 10){
             return "それらの差は11以上です";
         }else {
             return "それらの差は10以下です";
         }
	}

	public int ex3_11(int a, int b, int c){
		int x = Math.min(a,b);
         if (x < c){
             x = c;
         }
            return x;
	}

	public int ex3_12(int a, int b, int c){
    int max1 = Math.max(a,b);
    int max2 = Math.max(b,c);
    int max3 = Math.max(a,c);
    if(max1 == max2){
        return max3;
    }else if(max1 == max3){
         return max2;
    }else{
        return max1;
    }
}
	public String ex3_13(int a){

	}
}

