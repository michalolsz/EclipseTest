public class NthSeries {
	
	public static String seriesSum(int n) {
		float sum=1;
		if(n>1){
			for(int i=1;i<n;i++){
				sum=sum+1/(float)1/(i*3+1);
			}
			return String.format("%.2f", sum);
		}else return String.format("%.2f", 0f);
		
	}

	public static void main(String[] args) {
		System.out.println(new NthSeries().seriesSum(79));

	}
}