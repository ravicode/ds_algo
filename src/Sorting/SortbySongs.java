package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortbySongsPojo {

	int id;
	String songs;

	public SortbySongsPojo(int id, String songs) {
		this.id = id;
		this.songs = songs;
	}

	public String getSongs() {
		return songs;
	}

	public int getId() {
		return id;
	}

}

public class SortbySongs {

	public static void main(String[] args) {
		List<SortbySongsPojo> sortList = new ArrayList<SortbySongsPojo>();

		SortbySongsPojo ss = new SortbySongsPojo(1, "b1");
		sortList.add(ss);

		ss = new SortbySongsPojo(3, "aq");
		sortList.add(ss);

		ss = new SortbySongsPojo(2, "b3");
		sortList.add(ss);

		Collections.sort(sortList, cmp);
		for (SortbySongsPojo s : sortList) {
			System.out.println(s.songs + " " + s.getId());
		}

	}

	// static OrderBySongs cmp = new OrderBySongs();

	private static Comparator<SortbySongsPojo> cmp = new Comparator<SortbySongsPojo>() {

		@Override
		public int compare(SortbySongsPojo o1, SortbySongsPojo o2) {
			return o1.songs.compareTo(o2.songs);
		}

	};

}
