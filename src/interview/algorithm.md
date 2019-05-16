1.JAVA不使用第三个变量，交换两个变量的值

        a = a + b;
        b = a - b;
        a = a - b; 


2.编写一段程序找出int数组中的最小两个数，如{1,9,10,6,13,3},要求不用集合类，不用两种循环

	int[] arr={1,9,10,6,13,3};
        int m1,m2;
        m1=arr[0];
        m2=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<m1){
                m2=m1;
                m1=arr[i];
            }else if(arr[i]<m2){
                m2=arr[i];
            }
        }
       
