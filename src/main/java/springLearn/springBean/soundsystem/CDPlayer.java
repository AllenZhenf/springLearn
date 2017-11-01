package main.java.springLearn.springBean.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class CDPlayer implements MediaPlayer {
	@Autowired
	private CompactDisc cd;
	
	//��ͨ��������ע��
	@Autowired
	public CDPlayer(CompactDisc cd){
		this.cd=cd;
	}
	//��ͨ��set�ȷ���ע��
	@Autowired(required=false)//����beanΪ���׳��쳣ͨ������required=false
	public void setCompactDisc(CompactDisc cd){
		this.cd=cd;
	}
	
	@Override
	public void play(){
		cd.play();
	}
	
	@Bean
	public CompactDisc setPepper(){
		System.out.println(new SgtPeppers().hashCode());
		return new SgtPeppers();
	}	
	
	@Bean
	public CDPlayer cdPlayer(){
		System.out.println(new SgtPeppers().hashCode());
		return new CDPlayer(setPepper());
	}
	
	
}
