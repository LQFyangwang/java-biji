package com.gs.common;

import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicUtil {
	
	private Sequencer seq;
	
	public MusicUtil() {
		try {
			seq = MidiSystem.getSequencer();
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		} // 获取播放器
	}
	
	/**
	 * MidiSystem用来负责读取midi格式的音乐
	 * Sequence表示midi音乐数据流
	 * Seqer当作是一个播放器
	 */
	public void play(String filePath) {
		try {
			seq.open(); // 打开播放器
			seq.setSequence(MidiSystem.getSequence(new File(filePath))); // 给播放器指定一首歌
			seq.setLoopCount(10);
			seq.start(); // 开始播放音乐
		} catch (MidiUnavailableException e) { // Midi不可用
			e.printStackTrace();
		} catch (InvalidMidiDataException e) { // 不合法的midi格式 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void stop() {
		if (seq != null) {
			if (seq.isRunning()) { // 是否在播放
				seq.stop();
			} 
			if (seq.isOpen()) { // 是否打开了播放
				seq.close();
			}
		}
	}
}
