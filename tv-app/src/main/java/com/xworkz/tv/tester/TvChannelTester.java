package com.xworkz.tv.tester;

import java.nio.channels.Channel;

import com.xworkz.tv.dao.TvChannelDAO;
import com.xworkz.tv.dao.TvChannelDAOImpl;
import com.xworkz.tv.entity.TvChannel;

public class TvChannelTester {
	public static void main(String[] args) {
		TvChannel channel=new TvChannel();
		channel.setChannelId(1);
		channel.setChannelName("TV9");
		channel.setLanguage("KANNADA");
		channel.setFree(false);
		channel.setPrice(122.5);
		
		TvChannelDAO channelDAO=new TvChannelDAOImpl();
//		channelDAO.saveChannel(channel);
//		System.out.println("Saved sucessfully");
		channelDAO.getChannel();
		System.out.println("fetched sucessfully");
	}
	
	
	
	

}
