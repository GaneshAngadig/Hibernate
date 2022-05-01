package com.xworkz.tv.dao;

import com.xworkz.tv.entity.TvChannel;

public interface TvChannelDAO {
	public void saveChannel(TvChannel channel);
	
	public void getChannel();
	
	public void getChannelById(Integer integer);

}
