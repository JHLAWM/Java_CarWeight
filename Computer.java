/**   
 * @Title: Computer.java
 * @Package 
 * @Description: TODO(用一句话描述该文件做什么)
 * @author 江洪亮
 * @date 2017年11月12日 下午7:45:49
 * @version V1.0
 */

/** 
 * @ClassName: Computer
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 江洪亮
 * @date 2017年11月12日 下午7:45:49
 * 
 */
public class Computer implements ComputeWeight{
	private int m_num;	//数量
	private double m_weight; 	//重量
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public double getM_weight() {
		return m_weight;
	}
	public void setM_weight(double m_weight) {
		this.m_weight = m_weight;
	}
	Computer(int num,double weight){
		this.m_num=num;
		this.m_weight=weight;
	}
	public double computeWeight(){
		return m_weight*m_num;
	}
}
