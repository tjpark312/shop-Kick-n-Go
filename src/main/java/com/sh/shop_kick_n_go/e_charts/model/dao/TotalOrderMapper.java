package com.sh.shop_kick_n_go.e_charts.model.dao;

import com.sh.shop_kick_n_go.e_charts.model.dto.TotalOrderDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface TotalOrderMapper {
    int getTodaySales();

    List<TotalOrderDto> getDailySales(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    List<TotalOrderDto> getWeeklySales(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    List<TotalOrderDto> getMonthlySales(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    List<TotalOrderDto> getPeriodSales(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
}
