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
		} // ��ȡ������
	}
	
	/**
	 * MidiSystem���������ȡmidi��ʽ������
	 * Sequence��ʾmidi����������
	 * Seqer������һ��������
	 */
	public void play(String filePath) {
		try {
			seq.open(); // �򿪲�����
			seq.setSequence(MidiSystem.getSequence(new File(filePath))); // ��������ָ��һ�׸�
			seq.setLoopCount(10);
			seq.start(); // ��ʼ��������
		} catch (MidiUnavailableException e) { // Midi������
			e.printStackTrace();
		} catch (InvalidMidiDataException e) { // ���Ϸ���midi��ʽ 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void stop() {
		if (seq != null) {
			if (seq.isRunning()) { // �Ƿ��ڲ���
				seq.stop();
			} 
			if (seq.isOpen()) { // �Ƿ���˲���
				seq.close();
			}
		}
	}
}
