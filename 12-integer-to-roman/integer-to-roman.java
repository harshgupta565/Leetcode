class Solution {
    public String intToRoman(int num) {
        int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String sym[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String ans="";
        for(int x=0;x<values.length;x++)
        {
            if(num==0)break;
            while(num >=values[x])
            {
                ans+=sym[x];
                num-=values[x];
            }
        }
        return ans ; 


    }
}