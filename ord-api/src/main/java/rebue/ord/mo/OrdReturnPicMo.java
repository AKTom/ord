package rebue.ord.mo;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Database Table Remarks:
 *   退货图片
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table ORD_RETURN_PIC
 *
 * @mbg.generated do_not_delete_during_merge 2018-05-08 14:56:42
 */
@ApiModel(value = "OrdReturnPicMo", description = "退货图片")
@JsonInclude(Include.NON_NULL)
public class OrdReturnPicMo implements Serializable {
    /**
     * Database Column Remarks:
     *   退货图片ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN_PIC.ID
     *
     * @mbg.generated 2018-05-08 14:56:42
     */
    @ApiModelProperty(value = "退货图片ID")
    private Long id;

    /**
     * Database Column Remarks:
     *   退货ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN_PIC.RETURN_ID
     *
     * @mbg.generated 2018-05-08 14:56:42
     */
    @ApiModelProperty(value = "退货ID")
    private Long returnId;

    /**
     * Database Column Remarks:
     *   图片路径
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORD_RETURN_PIC.PIC_PATH
     *
     * @mbg.generated 2018-05-08 14:56:42
     */
    @ApiModelProperty(value = "图片路径")
    private String picPath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ORD_RETURN_PIC
     *
     * @mbg.generated 2018-05-08 14:56:42
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN_PIC.ID
     *
     * @return the value of ORD_RETURN_PIC.ID
     *
     * @mbg.generated 2018-05-08 14:56:42
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN_PIC.ID
     *
     * @param id the value for ORD_RETURN_PIC.ID
     *
     * @mbg.generated 2018-05-08 14:56:42
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN_PIC.RETURN_ID
     *
     * @return the value of ORD_RETURN_PIC.RETURN_ID
     *
     * @mbg.generated 2018-05-08 14:56:42
     */
    public Long getReturnId() {
        return returnId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN_PIC.RETURN_ID
     *
     * @param returnId the value for ORD_RETURN_PIC.RETURN_ID
     *
     * @mbg.generated 2018-05-08 14:56:42
     */
    public void setReturnId(Long returnId) {
        this.returnId = returnId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORD_RETURN_PIC.PIC_PATH
     *
     * @return the value of ORD_RETURN_PIC.PIC_PATH
     *
     * @mbg.generated 2018-05-08 14:56:42
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORD_RETURN_PIC.PIC_PATH
     *
     * @param picPath the value for ORD_RETURN_PIC.PIC_PATH
     *
     * @mbg.generated 2018-05-08 14:56:42
     */
    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORD_RETURN_PIC
     *
     * @mbg.generated 2018-05-08 14:56:42
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", returnId=").append(returnId);
        sb.append(", picPath=").append(picPath);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORD_RETURN_PIC
     *
     * @mbg.generated 2018-05-08 14:56:42
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrdReturnPicMo other = (OrdReturnPicMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
        ;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORD_RETURN_PIC
     *
     * @mbg.generated 2018-05-08 14:56:42
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}