public class User_Settings{
	public static final int INSTANCE_SPARSITY = 13; 	//Only 1 or prime number > 2 are allowed: {1,3, 5,7,11,13, ...}
														//(default:13)
													
	public static final int HIT_ERROR_TOLERENT = 20; 	//In the unit of y-axis coordinate (default:20)
														//Hit range: (-HIT_ERROR_TOLERENT,+HIT_ERROR_TOLERENT)
	
	public static final int SPEED_CONTROL_VALUE = 16;   //Speed of the falling bars (default:16)
														//the larger the faster
														
	public static final int CIRCLE_CONVERGE_MODE = 1; 	//mode 1: fasten outter radius  to different converge speed; 
														//mode 2 : outter radius propotional to the converge speed
														//(default:1)
}