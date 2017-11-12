/**   
 * @Title: Car.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author 江洪亮
 * @date 2017年11月12日 下午7:56:12
 * @version V1.0
 */

/** 
 * @ClassName: Car
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 江洪亮
 * @date 2017年11月12日 下午7:56:12
 * 
 */
public class Car {
	private ComputeWeight [] computeWeights;
	private double sum;
	Car(){
		computeWeights=new ComputeWeight [3];
		computeWeights[0]=new Computer(15, 18);//参数为 数量，总量；
		computeWeights[1]=new Television(20, 30);
		computeWeights[2]=new WashMachine(30, 24);
	}
	public void Calculate(){
		for(int i=0;i<3;i++)
		{
			sum+=computeWeights[i].computeWeight();
			switch(i)
			{
			case 0:
				System.out.println("电脑总重量为："+computeWeights[i].computeWeight());
				break;
			case 1:
				System.out.println("电视总重量为："+computeWeights[i].computeWeight());
				break;
			case 2:
				System.out.println("洗衣机总重量为："+computeWeights[i].computeWeight());
				System.out.println("所有总重量为："+sum);
			default:
				break;
			}
		}
	}

}