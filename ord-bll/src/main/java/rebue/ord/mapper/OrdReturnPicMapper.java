package rebue.ord.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import rebue.ord.mo.OrdReturnPicMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface OrdReturnPicMapper extends MybatisBaseMapper<OrdReturnPicMo, Long> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORD_RETURN_PIC
     *
     * @mbg.generated 2018-05-05 16:21:19
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORD_RETURN_PIC
     *
     * @mbg.generated 2018-05-05 16:21:19
     */
    int insert(OrdReturnPicMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORD_RETURN_PIC
     *
     * @mbg.generated 2018-05-05 16:21:19
     */
    int insertSelective(OrdReturnPicMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORD_RETURN_PIC
     *
     * @mbg.generated 2018-05-05 16:21:19
     */
    OrdReturnPicMo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORD_RETURN_PIC
     *
     * @mbg.generated 2018-05-05 16:21:19
     */
    int updateByPrimaryKeySelective(OrdReturnPicMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORD_RETURN_PIC
     *
     * @mbg.generated 2018-05-05 16:21:19
     */
    int updateByPrimaryKey(OrdReturnPicMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORD_RETURN_PIC
     *
     * @mbg.generated 2018-05-05 16:21:19
     */
    List<OrdReturnPicMo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORD_RETURN_PIC
     *
     * @mbg.generated 2018-05-05 16:21:19
     */
    List<OrdReturnPicMo> selectSelective(OrdReturnPicMo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORD_RETURN_PIC
     *
     * @mbg.generated 2018-05-05 16:21:19
     */
    boolean existByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORD_RETURN_PIC
     *
     * @mbg.generated 2018-05-05 16:21:19
     */
    boolean existSelective(OrdReturnPicMo record);
}