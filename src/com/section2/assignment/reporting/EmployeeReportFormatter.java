package com.section2.assignment.reporting;

import com.section2.assignment.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter{

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }
    public String getFormattedEmployee()
    {
        return getFormattedValue();
    }
}
