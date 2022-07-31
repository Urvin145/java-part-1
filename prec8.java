public class prec8 {
    public static void main(String[] args) {
        char[][] s1=new char[][]{
                {'A','B','A','C','C','D','E','E','A','D'},
                {'D','B','A','B','C','A','E','E','A','D'},
                {'E','D','D','A','C','B','E','E','A','D'},
                {'C','B','A','E','D','C','E','E','A','D'},
                {'A','B','D','C','C','D','E','E','A','D'},
                {'B','B','E','C','C','D','E','E','A','D'},
                {'B','B','A','C','C','D','E','E','A','D'},
                {'E','B','E','C','C','D','E','E','A','D'}};
        char[] s2=new
                char[]{'D','B','D','C','C','D','A','E','A','D'};
        for(int i=0;i<8;i++)
        {
            int count=0;
            for(int j=0;j<10;j++)
            {
                if(s1[i][j]==s2[j])
                {
                    count++;
                }
            }
            System.out.println("Correct answers of "+i+"Student :"+count);
        }
    }
}


