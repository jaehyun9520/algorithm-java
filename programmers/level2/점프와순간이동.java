package programmers.level2;
public class 점프와순간이동 {

    public static void main(String[] args) {

        System.out.println(solution(6));

    }

        public static int solution(int n) {
        int ans = 0;

        while(n!=0) {

            if(n%2==0) {
                n/=2;
            }
            else {
                n=n-1;
                ans++;
            }
        }

        return ans;
    }
}
