package com.example.hjw_echo.controller.response;

import java.util.List;

public class SearchDataResponse {
	private String lastBuildDate;
	private int total;
	private int start;
	private int display;
	private String category;
	private List<SearchDataItem> items;

	protected SearchDataResponse() {
	}

	public SearchDataResponse(String lastBuildDate, int total, int start, int display, String category,
		List<SearchDataItem> items) {
		this.lastBuildDate = lastBuildDate;
		this.total = total;
		this.start = start;
		this.display = display;
		this.category = category;
		this.items = items;
	}

	public String getLastBuildDate() {
		return lastBuildDate;
	}

	public int getTotal() {
		return total;
	}

	public int getStart() {
		return start;
	}

	public int getDisplay() {
		return display;
	}

	public String getCategory() {
		return category;
	}

	public List<SearchDataItem> getItems() {
		return items;
	}

	@Override
	public String toString() {
		return "SearchDataResponse{" +
			"lastBuildDate='" + lastBuildDate + '\'' +
			", total=" + total +
			", start=" + start +
			", display=" + display +
			", category='" + category + '\'' +
			", items=" + items +
			'}';
	}

	public static class SearchDataItem {
		private String title;
		private String link;
		private String category;
		private String description;
		private String telephone;
		private String address;
		private String roadAddress;
		private int mapx;
		private int mapy;

		protected SearchDataItem() {
		}

		public SearchDataItem(String title, String link, String category, String description, String telephone,
			String address,
			String roadAddress, int mapx, int mapy) {
			this.title = title;
			this.link = link;
			this.category = category;
			this.description = description;
			this.telephone = telephone;
			this.address = address;
			this.roadAddress = roadAddress;
			this.mapx = mapx;
			this.mapy = mapy;
		}

		public String getTitle() {
			return title;
		}

		public String getLink() {
			return link;
		}

		public String getCategory() {
			return category;
		}

		public String getDescription() {
			return description;
		}

		public String getTelephone() {
			return telephone;
		}

		public String getAddress() {
			return address;
		}

		public String getRoadAddress() {
			return roadAddress;
		}

		public int getMapx() {
			return mapx;
		}

		public int getMapy() {
			return mapy;
		}

		@Override
		public String toString() {
			return "SearchDataItem{" +
				"title='" + title + '\'' +
				", link='" + link + '\'' +
				", category='" + category + '\'' +
				", description='" + description + '\'' +
				", telephone='" + telephone + '\'' +
				", address='" + address + '\'' +
				", roadAddress='" + roadAddress + '\'' +
				", mapx=" + mapx +
				", mapy=" + mapy +
				'}';
		}
	}
}
