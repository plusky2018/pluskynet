package com.pluskynet.dao;

import java.sql.SQLException;
import java.util.List;

import com.pluskynet.domain.Cause;
import com.pluskynet.domain.Docsectionandrule;
import com.pluskynet.domain.Docsectionandrule01;
import com.pluskynet.domain.User;
import com.sun.star.rdf.QueryException;

import javassist.expr.NewArray;


public interface DocSectionAndRuleDao {
	boolean save(Docsectionandrule docsectionandrule,String table) throws SQLException, QueryException;

	List<Docsectionandrule> getDocList();

	List<Docsectionandrule> getDoc(Docsectionandrule docsectionandrule);

	List<Docsectionandrule> getDocLists(int sectionname,User user);

	void saveyl(Docsectionandrule docsectionandrule);

	void saveyldelete(String sectionname, User user);
	
	List<Docsectionandrule> listdoc(String doctable,int rows,String sectionname);
	void update(String doctable,String sectionname);

	Boolean plsave(List<Docsectionandrule> docsectionlist, String doctable);

	List<Docsectionandrule01> getDocsectionList(Cause cause, String year, int valueOf, String trialRound,
			String doctype);

}
