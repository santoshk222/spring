package spittr.data;

import java.util.List;

import spittr.Spittle;

public interface SpittleRepository {
	List<Spittle> findSpittles(Long max,int count);

}
