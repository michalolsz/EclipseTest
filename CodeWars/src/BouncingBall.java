public class BouncingBall {

	public static int bouncingBall(double h, double bounce, double window) {
		if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h)
			return -1;
		int ile = 0;
		while (h>window) {
			h = h * bounce;
			ile++;
		}
		return 2*ile-1;

	}
}