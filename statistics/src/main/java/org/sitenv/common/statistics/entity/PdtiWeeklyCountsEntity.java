package org.sitenv.common.statistics.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@NamedNativeQueries({
	@NamedNativeQuery(name="pdtiWeeklyCounts", query = "SELECT * FROM pdti_weekly_counts(?)", resultClass = PdtiWeeklyCountsEntity.class)

})
public class PdtiWeeklyCountsEntity {
	
	@Id
	@Column(name="start_date")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(name="end_date")
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@Column(name="range_interval")
	private Integer interval; // month number or week number
	
	@Column(name="range_year")
	private Integer year;
	
	@Column(name="totaltest_count")
	private Long totalTestCount;

	@Column(name="totalrequest_count")
	private Long totalRequestCount;
	
	@Column(name="totaluniqueendpoint_count")
	private Long totalUniqueEndpointCount;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result
				+ ((interval == null) ? 0 : interval.hashCode());
		result = prime * result
				+ ((startDate == null) ? 0 : startDate.hashCode());
		result = prime
				* result
				+ ((totalRequestCount == null) ? 0 : totalRequestCount
						.hashCode());
		result = prime * result
				+ ((totalTestCount == null) ? 0 : totalTestCount.hashCode());
		result = prime
				* result
				+ ((totalUniqueEndpointCount == null) ? 0
						: totalUniqueEndpointCount.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PdtiWeeklyCountsEntity other = (PdtiWeeklyCountsEntity) obj;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (interval == null) {
			if (other.interval != null)
				return false;
		} else if (!interval.equals(other.interval))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (totalRequestCount == null) {
			if (other.totalRequestCount != null)
				return false;
		} else if (!totalRequestCount.equals(other.totalRequestCount))
			return false;
		if (totalTestCount == null) {
			if (other.totalTestCount != null)
				return false;
		} else if (!totalTestCount.equals(other.totalTestCount))
			return false;
		if (totalUniqueEndpointCount == null) {
			if (other.totalUniqueEndpointCount != null)
				return false;
		} else if (!totalUniqueEndpointCount
				.equals(other.totalUniqueEndpointCount))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getInterval() {
		return interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Long getTotalTestCount() {
		return totalTestCount;
	}

	public void setTotalTestCount(Long totalTestCount) {
		this.totalTestCount = totalTestCount;
	}

	public Long getTotalRequestCount() {
		return totalRequestCount;
	}

	public void setTotalRequestCount(Long totalRequestCount) {
		this.totalRequestCount = totalRequestCount;
	}

	public Long getTotalUniqueEndpointCount() {
		return totalUniqueEndpointCount;
	}

	public void setTotalUniqueEndpointCount(Long totalUniqueEndpointCount) {
		this.totalUniqueEndpointCount = totalUniqueEndpointCount;
	}

	
}
