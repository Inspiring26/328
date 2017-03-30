public class River
{
	public static void main(String[] args) {
		//a野人 b传道士
		int a0=0,b0=0,a1=3,b1=3,boat=1;
		label:while((a1!=0)&&(b1!=0))
		{
			//boat at right
			//two yeren goto other side
			if (boat==1) {
				
			
				if ((a1>=2)&&((a1-2)<=b1)) {
					a0=a0+2;a1=a1-2;boat=0;
					System.out.println("two yeren right to left    <<---------");
					System.out.println("a0:"+a0+", "+"b0:"+b0+", "+"a1:"+a1+", "+"b1:"+b1);
					continue label;
				}
				if ((a1>=2)&&(b0==0)) {
					a0=a0+2;a1=a1-2;boat=0;
					System.out.println("two yeren right to left    <<---------");
					System.out.println("a0:"+a0+", "+"b0:"+b0+", "+"a1:"+a1+", "+"b1:"+b1);
					continue label;
				}
				//two chuanjiaoshi goto other side
				if ((b1>=2)&&(a1<=(b1-2))) {
					b0=b0+2;b1=b1-2;boat=0;
					System.out.println("two chuanjiaoshi right to left    <<---------");
					System.out.println("a0:"+a0+", "+"b0:"+b0+", "+"a1:"+a1+", "+"b1:"+b1);
					continue label;
				}
				if ((b1>=2)&&(a1>(b1-2))&&((b1-2)==0)) {
					b0=b0+2;b1=b1-2;boat=0;
					System.out.println("two chuanjiaoshi right to left    <<---------");
					System.out.println("a0:"+a0+", "+"b0:"+b0+", "+"a1:"+a1+", "+"b1:"+b1);
					continue label;
				}
				//a yeren a chuanjiaoshi goto other side
				if ((a1>=1)&&(b1>=1)&&(a1<=b1)) {
					a0=a0+1;b0=b0+1;a1=a1-1;b1=b1-1;boat=0;
					System.out.println("a yeren a chuanjiaoshi right to left    <<---------");
					System.out.println("a0:"+a0+", "+"b0:"+b0+", "+"a1:"+a1+", "+"b1:"+b1);
					continue label;
				}
				//a yeren goto other side
				if ((a1>=1)&&((a1-1)<=b1)) {
					a0=a0+1;a1=a1-1;boat=0;
					System.out.println("a yeren right to left    <<---------");
					System.out.println("a0:"+a0+", "+"b0:"+b0+", "+"a1:"+a1+", "+"b1:"+b1);
					continue label;
				}
				if ((a1>=1)&&(b0==0)) {
					a0=a0+1;a1=a1-1;boat=0;
					System.out.println("a yeren right to left    <<---------");
					System.out.println("a0:"+a0+", "+"b0:"+b0+", "+"a1:"+a1+", "+"b1:"+b1);
					continue label;
				}
				//a chuanjiaoshi goto other side
				if ((b1>=1)&&(a1<=(b1-1))) {
					b0=b0+1;b1=b1-1;boat=0;
					System.out.println("a chuanjiaoshi right to left    <<---------");
					System.out.println("a0:"+a0+", "+"b0:"+b0+", "+"a1:"+a1+", "+"b1:"+b1);
					continue label;
				}
				if ((b1>=1)&&(a1>(b1-1))&&((b1-1)==0)) {
					b0=b0+1;b1=b1-1;boat=0;
					System.out.println("a chuanjiaoshi right to left    <<---------");
					System.out.println("a0:"+a0+", "+"b0:"+b0+", "+"a1:"+a1+", "+"b1:"+b1);
					continue label;
				}
			}

			//boat at left
			//a yeren goto other side
			if (boat==0) {
				
			
				if ((a0>=1)&&((a0-1)<=b0)) {
					a0=a0-1;a1=a1+1;boat=1;
					System.out.println("a yeren left to right  ---------->>");
					System.out.println("a0:"+a0+", "+"b0:"+b0+", "+"a1:"+a1+", "+"b1:"+b1);
					continue label;
				}
				if ((a0>=1)&&!((a0-1)<=b0)&&(b0==0)) {
					a0=a0-1;a1=a1+1;boat=1;
					System.out.println("a yeren left to right  ---------->>");
					System.out.println("a0:"+a0+", "+"b0:"+b0+", "+"a1:"+a1+", "+"b1:"+b1);
					continue label;
				}
				//a chuanjiaoshi goto other side
				if ((b0>=1)&&(a0<=(b0-1))) {
					b0=b0-1;b1=b1+1;boat=1;
					System.out.println("a chuanjiaoshi left to right  ---------->>");
					System.out.println("a0:"+a0+", "+"b0:"+b0+", "+"a1:"+a1+", "+"b1:"+b1);
					continue label;
				}
				if ((b0>=1)&&(a0>(b0-1))&&((b0-1)==0)) {
					b0=b0-1;b1=b1+1;boat=1;
					System.out.println("a chuanjiaoshi left to right  ---------->>");
					System.out.println("a0:"+a0+", "+"b0:"+b0+", "+"a1:"+a1+", "+"b1:"+b1);
					continue label;
				}
				//a chuanjiaoshi a yeren goto other side
				if ((a0>=1)&&(b0>=1)&&(a0<=b0)) {
					a0=a0-1;b0=b0-1;a1=a1+1;b1=b1+1;boat=1;
					System.out.println("a chuanjiaoshi a yeren left to right  ---------->>");
					System.out.println("a0:"+a0+", "+"b0:"+b0+", "+"a1:"+a1+", "+"b1:"+b1);
					continue label;
				}
				//two yeren goto other side
				if ((a0>=2)&&((a0-2)<b0)) {
					a0=a0-2;a1=a1+2;boat=1;
					System.out.println("two yeren left to right  ---------->>");
					System.out.println("a0:"+a0+", "+"b0:"+b0+", "+"a1:"+a1+", "+"b1:"+b1);
					continue label;
				}
				if ((a0>=2)&&((a0-2)>b0)&&(b0==0)) {
					a0=a0-2;a1=a1+2;boat=1;
					System.out.println("two yeren left to right  ---------->>");
					System.out.println("a0:"+a0+", "+"b0:"+b0+", "+"a1:"+a1+", "+"b1:"+b1);
					continue label;
				}
				//two chuanjiaoshi goto other side
				if ((b0>=2)&&(a0<=(b0-2))) {
					b0=b0-2;b1=b1+2;boat=1;
					System.out.println("two chuanjiaoshi left to right  ---------->>");
					System.out.println("a0:"+a0+", "+"b0:"+b0+", "+"a1:"+a1+", "+"b1:"+b1);
					continue label;
				}
				if ((b0>=2)&&(a0>(b0-2))&&((b0-2)==0)) {
					b0=b0-2;b1=b1+2;boat=1;
					System.out.println("two chuanjiaoshi left to right  ---------->>");
					System.out.println("a0:"+a0+", "+"b0:"+b0+", "+"a1:"+a1+", "+"b1:"+b1);
					continue label;
				}
			}
		}
		System.out.println("a1:"+a1+",  "+"b1:"+b1+",  "+"boat:"+boat);
	}
}










