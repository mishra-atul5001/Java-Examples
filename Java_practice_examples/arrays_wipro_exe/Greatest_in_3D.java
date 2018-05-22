package arrays_wipro_exe;

public class Greatest_in_3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p =new int[9];
		int i,r,max=p[0],f=0,z,m,j=0;	
		for(i=0;i<args.length;i++) {
			p[j++]=Integer.parseInt(args[i]);
		}
		for(r=0;r<=8;r++) {
			if(p[r]>max)
			max=p[r];
		}
	
		for(m=0;m<3;m++) {
			
		for(z=0;z<3;z++) {
			System.out.print(p[f]+" ");
			f++;
		}
		System.out.println();
	}
	System.out.println(max);
	}
}
