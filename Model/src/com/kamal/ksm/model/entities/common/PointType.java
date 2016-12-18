package com.kamal.ksm.model.entities.common;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.sql.SQLException;

import oracle.jbo.JboException;
import oracle.jbo.StructureDef;
import oracle.jbo.domain.DatumFactory;
import oracle.jbo.domain.DomainAttributeDef;
import oracle.jbo.domain.DomainInterface;
import oracle.jbo.domain.DomainOwnerInterface;
import oracle.jbo.domain.DomainStructureDef;
import oracle.jbo.domain.Struct;

import oracle.sql.*;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Dec 18 23:05:08 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PointType
  extends Struct
{
  static ORADataFactory[] mCustDatFac = null;
  static int[] mSQLTypes = null;
  static DomainStructureDef mStructureDef = null;
  static ORADataFactory fac;

  public PointType(Datum value)
    throws SQLException
  {
    super(value);
  }

  public PointType()
    throws SQLException
  {
  }

  public static ORADataFactory getORADataFactory()
  {
    if (fac == null)
    {
      class facClass
        implements ORADataFactory
      {
        public ORAData create(Datum d, int sql_type_code)
          throws SQLException
        {
          if (d != null)
          {
            return new PointType(d);
          }
          return null;
        }
      }
      fac = new facClass();
    }
    return fac;
  }

  public int[] getAttrSQLTypes()
  {
    if (mSQLTypes == null)
    {
      mSQLTypes = buildAttrSQLTypes();
    }
    return mSQLTypes;
  }

  public StructureDef getStructureDef()
  {
    return mStructureDef;
  }

  public String getColumnType()
  {
    return "POINT_TYPE";
  }

  public BigDecimal getXCoord()
  {
    return (BigDecimal) getAttribute(0);
  }

  public void setXCoord(BigDecimal value)
  {
    setAttribute(0, value);
  }

  public BigDecimal getYCoord()
  {
    return (BigDecimal) getAttribute(1);
  }

  public void setYCoord(BigDecimal value)
  {
    setAttribute(1, value);
  }

  public void initStructureDef()
  {
    DomainAttributeDef[] attrs = new DomainAttributeDef[2];
    if (mStructureDef == null)
    {
      attrs[0] = new DomainAttributeDef("XCoord", "X_COORD", 0, BigDecimal.class, 2, "NUMERIC", 0, 0, false);
      attrs[1] = new DomainAttributeDef("YCoord", "Y_COORD", 1, BigDecimal.class, 2, "NUMERIC", 0, 0, false);
      mStructureDef = new DomainStructureDef(attrs);
    }
  }

  public ORADataFactory[] getAttrORADataFactories()
  {
    if (mCustDatFac == null)
    {
      mCustDatFac = new ORADataFactory[2];
      mCustDatFac[0] = null;
      mCustDatFac[1] = null;
    }
    return mCustDatFac;
  }
}

