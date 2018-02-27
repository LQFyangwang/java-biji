

import java.io.File;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

class Sound {
	String path = new String("musics\\"); //目录

	String file = new String("nor.mid"); //播放的音乐文件名称

	Sequence seq; //序列

	Sequencer midi; //定义一个Sequencer类型的变量

	boolean sign;//标志，true为正在播放，反之没有播放

	public Sound() {
		loadSound();
	}
	void loadSound() {//播放音乐
		try {
			seq = MidiSystem.getSequence(new File(path + file)); //读取音乐文件（I/O流操作）
			midi = MidiSystem.getSequencer(); //创建一个音乐设备播放器,初始化参数
			midi.open(); //打开音乐设备播放器
			midi.setSequence(seq); //把文件传给设备播放器
			midi.start(); //开始播放
			midi.setLoopCount(Sequencer.LOOP_CONTINUOUSLY); //无限循环播放
		}
		catch ( Exception ex ) {
			ex.printStackTrace();
		}
		sign = true;
	}

	void mystop() { //关音乐
		if(isplay()){
			midi.stop(); //停止播放
			midi.close();//关闭设备
			sign = false;
		}
	}

	boolean isplay() { //判断sign的值，为真表示在播放，否则未播放
		return sign;
	}

	void setMusic(String e) { //获取音乐文件名称
		file = e;
	}
}