
/*
����java������break��䣺
	1.break��java�����еĹؼ��֣���˼Ϊ���ж�/�۶ϡ�
	
	2.break+";"���Գ�Ϊһ��������������java��䣺    break;
	
	3.break���ʹ����switch����У�������ֹswitch���ִ��
	
	4.break���ͬ����������ѭ����䵱�У�������ֹѭ�����
	
	5.break��ֹ�Ǹ�ѭ���أ�
	
	6.break;�������for��while��do...while��䵱����������ѭ������ֹѭ����ִ��
	��Ϊ������ѭ����ĳ������ʱ�򣬺�����ѭ������û��Ҫ����ִ�У���ִ�о����˷���Դ��
	���Կ�����ֹѭ�����Դ��������Ч��
	
	7.������forѭ����break;���
	
	8.��Ĭ������£�break�����ֹ�������������ѭ����䡣��ȻҲ����ָ����ֹĳ��ѭ����
	��Ҫ��ѭ�����������������﷨�� break ѭ������;

*/

public class BreakTest01{
	
	public static void main(String[] args){
		
		for(int i=0;i<10;i++){
			if(i==5){
				break;//��ֹ��������ѭ���壬��ǰforѭ��
			}         //����i=5ʱ���������i��仰Ҳ����ִ���ˡ�
			System.out.println("i-->"+i);
		}
		
		//�������0 1 2 3 4
		
		System.out.println("Hello World!");//������java��䣬�������forѭ���޹�
		
		for(int j=0;j<3;j++){
			for(int i=0;i<10;i++){
			    if(i==5){
				    break;//��ֹ�����ڲ�forѭ�����������
			    }
			    System.out.println("i-->"+i);
			}			//�����break��䲢����Ӱ�쵽���forѭ��
	    }
		//���ѭ����ѭ�����Σ�Ҳ����˵
		//�����3�� 0 1 2 3 4
		
		System.out.println("---------------");
		
		//�����﷨ʹ�ý��١�
		//��forѭ����������
		for1:for(int j=0;j<3;j++){
			for2:for(int i=0;i<10;i++){
			        if(i==5){
				    break for1;//��ֹ����for1ѭ��
			        }
			        System.out.println("i-->"+i);
			}
	    }
		
		//������j=0,j<3Ϊtrue,ִ��for1ѭ���壬
		//��for2��ʼִ�У�ִ�е�0 1 2 3 4��i=5��ʱ��for1ѭ����ֹ��ֱ����������for1ѭ��������
		//Ҳ������� 0 1 2 3 4������
		
		System.out.println("Hello World!");
		
	}
}
	
	







