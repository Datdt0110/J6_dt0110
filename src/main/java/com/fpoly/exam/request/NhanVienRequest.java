package com.fpoly.exam.request;

import com.fpoly.exam.entity.ChucVu;
import com.fpoly.exam.entity.NhanVien;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class NhanVienRequest {
    Integer id;

    @NotBlank(message = "Mã nhân viên không được để trống")
    String ma;

    @NotBlank(message = "Họ không được để trống")
    String ho;

    @NotBlank(message = "Tên đệm không được để trống")
    String tendem;

    @NotBlank(message = "Tên không được để trống")
    String ten;

    @NotBlank(message = "Giới tính không được để trống")
    String gioitinh;

    @NotBlank(message = "Địa chỉ không được để trống")
    String diachi;

    @NotNull(message = "ID chức vụ không được để null")
    Integer idCv;


    public NhanVien toEntity(){
        NhanVien nv = new NhanVien();
        nv.setId(id);
        nv.setMa(ma);
        nv.setHo(ho);
        nv.setTen(ten);
        nv.setTen_dem(tendem);
        nv.setGioi_tinh(gioitinh);
        nv.setDia_chi(diachi);
        if(idCv != null){
            ChucVu cv = new ChucVu();
            cv.setId(idCv);
            nv.setChucVu(cv);
        }
        return nv;
    }
}
