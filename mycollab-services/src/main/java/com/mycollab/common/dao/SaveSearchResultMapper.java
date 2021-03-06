package com.mycollab.common.dao;

import com.mycollab.common.domain.SaveSearchResult;
import com.mycollab.common.domain.SaveSearchResultExample;
import com.mycollab.db.persistence.ICrudGenericDAO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface SaveSearchResultMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_save_search_result
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    long countByExample(SaveSearchResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_save_search_result
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    int deleteByExample(SaveSearchResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_save_search_result
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_save_search_result
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    int insert(SaveSearchResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_save_search_result
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    int insertSelective(SaveSearchResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_save_search_result
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    List<SaveSearchResult> selectByExampleWithBLOBs(SaveSearchResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_save_search_result
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    List<SaveSearchResult> selectByExample(SaveSearchResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_save_search_result
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    SaveSearchResult selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_save_search_result
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    int updateByExampleSelective(@Param("record") SaveSearchResult record, @Param("example") SaveSearchResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_save_search_result
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    int updateByExampleWithBLOBs(@Param("record") SaveSearchResult record, @Param("example") SaveSearchResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_save_search_result
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    int updateByExample(@Param("record") SaveSearchResult record, @Param("example") SaveSearchResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_save_search_result
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    int updateByPrimaryKeySelective(SaveSearchResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_save_search_result
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    int updateByPrimaryKeyWithBLOBs(SaveSearchResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_save_search_result
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    int updateByPrimaryKey(SaveSearchResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_save_search_result
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    Integer insertAndReturnKey(SaveSearchResult value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_save_search_result
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_save_search_result
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    void massUpdateWithSession(@Param("record") SaveSearchResult record, @Param("primaryKeys") List primaryKeys);
}