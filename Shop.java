package com.cn;
import java.util.*;
public class Shop
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String username=null;//�洢��¼��ע��ɹ����û���
		//��������Դ��Ϣ
		int[] uid=new int[10];
		String[] uname=new String[10];
		String[] password=new String[10];
		double[] money=new double[10];
		
		int[] gid=new int[10];
		String[] gname=new String[10];
		String[] place=new String[10];
		int[] number=new int[10];
		double[] price=new double[10];
		String[] type=new String[10];
		
		int[] bid=new int[10];//�洢�������Ʒ���
		int[] bnum=new int[10];
		
		//��ʼ������
		uid[0]=1001;
		uname[0]="admin";
		password[0]="123456";
		money[0]=1000;
		
		gid[0]=1;
		gname[0]="TCL42��Һ���ʵ�";
		place[0]="CHINA";
		number[0]=10;
		price[0]=4200;
		type[0]="����";
		
		gid[1]=2;
		gname[1]="�������ܵ����";
		place[1]="CHINA";
		number[1]=10;
		price[1]=5200;
		type[1]="����";
		
		gid[2]=3;
		gname[2]="��������ɫϴ�»�";
		place[2]="GERMA";
		number[2]=5;
		price[2]=6000;
		type[2]="����";
		
		gid[3]=4;
		gname[3]="�����˶���Ь";
		place[3]="CHINA";
		number[3]=10;
		price[3]=1200;
		type[3]="����";
		
		gid[4]=5;
		gname[4]="ɽ����̨ƻ��";
		place[4]="CHINA";
		number[4]=50;
		price[4]=10;
		type[4]="ˮ��";
		
		System.out.println("----------------��ݸ�̳�--------------------");
		String ay=null;
		do
		{
			String an=null;
			String typeName=null;
			do
			{
				an="n";
				System.out.println("��Ʒ����:");
				System.out.println("                  1.����");
				System.out.println("                  2.����");
				System.out.println("                  3.ˮ��");
				System.out.println("��ѡ��:");
				int m=input.nextInt();
				if(m==1)
				{
					typeName="����";
				}
				else if(m==2)
				{
					typeName="����";
				}
				else if(m==3)
				{
					typeName="ˮ��";
				}
				else
				{
					System.out.println("�������������ѡ��!");
					an="y";
				}
			}while(an.equals("y"));
			String az=null;
			do
			{
				String aq=null;
				int id=0;
				do
				{
					aq="n";
					for(int i=0;i<10;i++)
					{
						if(gname[i]!=null&&type[i].equals(typeName))
						{
							System.out.println(gid[i]+"\t"+gname[i]+"\t"+place[i]+"\t"+number[i]+"\t"+price[i]);
						}
					}
					System.out.println("������Ҫ�������Ʒ���:");
					id=input.nextInt();
					if(username==null)
					{
						System.out.println("����û�е�¼�����¼��ע����!");
						String am=null;
						do
						{
							am="n";
							System.out.println("----------------------------------------------");
							System.out.println("                  1.��¼");
							System.out.println("                  2.ע��");
							System.out.println("��ѡ��:");
							int n=input.nextInt();
							if(n==1)
							{
								String ac=null;
								do
								{
									ac="n";
									System.out.println("�������û���:");
									String name=input.next();
									System.out.println("��������  ��:");
									String pwd=input.next();
									for(int i=0;i<10;i++)
									{
										if(uname[i]!=null)
										{
											if(uname[i].equals(name)&&password[i].equals(pwd))
											{
												username=name;
												break;
											}
										}
									}
									if(username!=null)
									{
										System.out.println("��¼�ɹ�����ӭ�û�"+username);
									}
									else
									{
										System.out.println("��¼ʧ�ܣ������������û���������!!");
										ac="y";
									}
								}while(ac.equals("y"));
							}
							else if(n==2)
							{
								String ax=null;
								String name=null;
								do
								{
									ax="n";
									boolean isFlag=false;
									System.out.println("�������û���:");
									name=input.next();
									for(int i=0;i<10;i++)
									{
										if(uname[i]!=null)
										{
											if(uname[i].equals(name))
											{
												isFlag=true;
												break;
											}
										}
									}
									if(isFlag)
									{
										System.out.println("���û����ѱ�ռ�ã�����������!");
										ax="y";
									}
								}while(ax.equals("y"));
								String as=null;
								String pwd=null;
								do
								{
									as="n";
									System.out.println("����������:");
									pwd=input.next();
									if(pwd.length()<6)
									{
										System.out.println("���볤�Ȳ���������λ������������!");
										as="y";
									}
								}while(as.equals("y"));
								String ap=null;
								String confPwd=null;
								do
								{
									ap="n";
									System.out.println("������ȷ������:");
									confPwd=input.next();
									if(!confPwd.equals(pwd))
									{
										System.out.println("ȷ����������벻һ�£�����������!");
										ap="y";
									}
								}while(ap.equals("y"));
								String ak=null;
								double my=0;
								do
								{
									ak="n";
									System.out.println("������ȷ��ע����:");
									my=input.nextDouble();
									if(my<100)
									{
										System.out.println("ע����ܵ���100Ԫ������������!");
										ak="y";
									}
								}while(ak.equals("y"));
								String ar=null;
								do
								{
										ar="n";
										double r=Math.random();
										int checkNum=(int)(r*10000);
										System.out.println("��֤��:"+checkNum);
										System.out.println("��������֤��:");
										int ck=input.nextInt();
										if(ck!=checkNum)
										{
											System.out.println("��֤�������������������!");
											ar="y";
										}
								}while(ar.equals("y"));
								for(int i=0;i<10;i++)
								{
									if(uname[i]==null)
									{
										uid[i]=uid[i-1]+1;
										uname[i]=name;
										password[i]=pwd;
										money[i]=my;
										break;
									}
								}
								username=name;
								System.out.println("ע��ɹ�����ӭ���û�"+username);
							}
							else
							{
								System.out.println("�������������ѡ��!");
								am="y";
							}
						}while(am.equals("y"));
					}
					boolean flag=false;
					for(int i=0;i<10;i++)
					{
						if(gname[i]!=null&&type[i].equals(typeName))
						{
							if(gid[i]==id)
							{
								flag=true;
								break;
							}
						}
					}
					if(flag==false)
					{
						System.out.println("�������������ѡ��!");
						aq="y";
					}
				}while(aq.equals("y"));
				int a=0;
				String al=null;
				do
				{
					al="n";
					boolean isCheck=false;
					System.out.println("������Ҫ���������:");
					a=input.nextInt();
					for(int i=0;i<10;i++)
					{
						if(gid[i]==id)
						{
							if(number[i]<a)
							{
								isCheck=true;
							}
							else
							{
								number[i]=number[i]-a;
							}
							break;
						}
					}
					if(isCheck)
					{
						System.out.println("��治�㣬���������빺������!");
						al="y";
					}
				}while(al.equals("y"));
				for(int i=0;i<10;i++)
				{
					if(bid[i]==0)
					{
						bid[i]=id;
						bnum[i]=a;
						break;
					}
				}
				System.out.println("������Ҫ��������"+typeName+"��?");
				az=input.next();
			}while(az.equals("y"));
			System.out.println("������Ҫ����������?");
			ay=input.next();
		}while(ay.equals("y"));
		System.out.println("--------------���ı��ι����嵥----------------");
		for(int i=0;i<10;i++)
		{
			if(bid[i]!=0)
			{
				System.out.println(bid[i]+"\t"+bnum[i]);
			}
		}
		
	}
}