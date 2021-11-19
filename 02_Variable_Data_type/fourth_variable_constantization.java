public class fourth_variable_constantization {
    public static void main(String[] args) {
        int a =3;
		a=4;
        // In the case of the code below, variables can be changed.
		double PI =3.14;
		PI=3.15;
        // In the case of the code below, it is impossible to change the variable.
        // If you don't want to change the code, you can put the final in front.
		final double PI2=3.14;
        // It can be confirmed that the value does not change if the code below is canceled.
		// PI2=3.15;
    }
}
