//***********************************************************************************************
//* File: 'CheminementProgrammeSolution2_3.java'
//* THIS IS A GENERATED FILE: DO NOT EDIT. Please edit the Perfect Developer source file instead!
//*
//* Generated from: 'C:/Users/Administrator/Google Drive/school/session3/CheminementProgrammeSolution2_3.pd'
//* by Perfect Developer version 6.00.00.03 at 01:03:23 UTC on Monday December 14th 2015
//* Using command line options:
//* -z1 -el=3 -em=100 -gl=Java -gs=1 -gv=ISO -gw=100 -gdp=1 -gdo=1 -gdc=4 -gda=1 -gdA=1 -gdl=3 -gdr=1 -gdt=1 -gdi=1 -st=4 -sb=C:/Program Files (x86)/Escher Technologies/Verification Studio 6/Bin/builtin.pd -sr=C:/Program Files (x86)/Escher Technologies/Verification Studio 6/Bin/rubric.pd -q=0 -eM=0 -@=C:/Temp/etf633C.tmp
//***********************************************************************************************

// Packages imported
import Ertsys.*;


final class Cours extends _eEnumBase
{
    public Cours ()
    {
    }

    public Cours (int _lArg1)
    {
        super (_lArg1);
    }

    public static _eSeq _oRange (int _lArg1, int _lArg2)
    {
        _eSeq _lResult = new _eSeq ();
        while (_lArg1 <= _lArg2) _lResult = _lResult._lAppend (new Cours (_lArg1 ++));
        return _lResult;
    }

}

final class Identificateur extends _eEnumBase
{
    public Identificateur ()
    {
    }

    public Identificateur (int _lArg1)
    {
        super (_lArg1);
    }

    public static _eSeq _oRange (int _lArg1, int _lArg2)
    {
        _eSeq _lResult = new _eSeq ();
        while (_lArg1 <= _lArg2) _lResult = _lResult._lAppend (new Identificateur (_lArg1 ++));
        return _lResult;
    }

}

final class CoursInfo extends _eAny
{
    public int niveau;
    public _eSet prealables;
    public void enleverPrealable (int c, Cours _t0c)
    {
        _eSet _vUnshare_67_14 = ((_eSet) prealables._lClone ());
        prealables = _vUnshare_67_14;
        _vUnshare_67_14._iz_remove (((_eAny) new Cours (c)));
    }

    public void modifierPrealablesC (_eSet pr, Cours _t0pr)
    {
        prealables = pr;
    }

    public CoursInfo (int _vniveau, _eSet _vprealables, Cours _t0_vprealables)
    {
        super ();
        niveau = _vniveau;
        prealables = _vprealables;
    }

    public boolean _lEqual (CoursInfo _vArg_60_9)
    {
        if (this == _vArg_60_9)
        {
            return true;
        }
        return ((_vArg_60_9.niveau == niveau) && _vArg_60_9.prealables._lEqual (prealables));
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == CoursInfo.class && _lEqual ((
            CoursInfo) _lArg));
    }

}

final class RepertoireCours extends _eAny
{
    final void _lc_RepertoireCours (String _lArg)
    {
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_92_5;
                {
                    _eSet _vCaptureBound_c_92_24 = coursRep.dom ();
                    _vQuantifierResult_92_5 = true;
                    int _vCaptureCount_c_92_24 = _vCaptureBound_c_92_24._oHash ();
                    int _vLoopCounter_92_12 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_92_12 == _vCaptureCount_c_92_24) || (!
                            _vQuantifierResult_92_5))) break;
                        boolean _vQuantifierResult_92_31;
                        {
                            _eSet _vCaptureBound_cp_92_54 = ((CoursInfo) coursRep._oIndex (
                                _vCaptureBound_c_92_24._oIndex (_vLoopCounter_92_12))).prealables;
                            _vQuantifierResult_92_31 = true;
                            int _vCaptureCount_cp_92_54 = _vCaptureBound_cp_92_54._oHash ();
                            int _vLoopCounter_92_38 = 0;
                            for (;;)
                            {
                                if (((_vLoopCounter_92_38 == _vCaptureCount_cp_92_54) || (!
                                    _vQuantifierResult_92_31))) break;
                                _vQuantifierResult_92_31 = coursRep._ovIn (_vCaptureBound_cp_92_54.
                                    _oIndex (_vLoopCounter_92_38));
                                if ((!_vQuantifierResult_92_31))
                                {
                                }
                                else
                                {
                                    _vLoopCounter_92_38 = _eSystem._oSucc (_vLoopCounter_92_38);
                                }
                            }
                        }
                        _vQuantifierResult_92_5 = _vQuantifierResult_92_31;
                        if ((!_vQuantifierResult_92_5))
                        {
                        }
                        else
                        {
                            _vLoopCounter_92_12 = _eSystem._oSucc (_vLoopCounter_92_12);
                        }
                    }
                }
                if (!(_vQuantifierResult_92_5)) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:92,5", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_93_5;
                {
                    _eSet _vCaptureBound_c_93_24 = coursRep.dom ();
                    _vQuantifierResult_93_5 = true;
                    int _vCaptureCount_c_93_24 = _vCaptureBound_c_93_24._oHash ();
                    int _vLoopCounter_93_12 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_93_12 == _vCaptureCount_c_93_24) || (!
                            _vQuantifierResult_93_5))) break;
                        boolean _vQuantifierResult_93_31;
                        {
                            _eSet _vCaptureBound_cp_93_54 = ((CoursInfo) coursRep._oIndex (
                                _vCaptureBound_c_93_24._oIndex (_vLoopCounter_93_12))).prealables;
                            _vQuantifierResult_93_31 = true;
                            int _vCaptureCount_cp_93_54 = _vCaptureBound_cp_93_54._oHash ();
                            int _vLoopCounter_93_38 = 0;
                            for (;;)
                            {
                                if (((_vLoopCounter_93_38 == _vCaptureCount_cp_93_54) || (!
                                    _vQuantifierResult_93_31))) break;
                                _vQuantifierResult_93_31 = (((CoursInfo) coursRep._oIndex (
                                    _vCaptureBound_cp_93_54._oIndex (_vLoopCounter_93_38))).niveau <
                                    ((CoursInfo) coursRep._oIndex (_vCaptureBound_c_93_24._oIndex (
                                    _vLoopCounter_93_12))).niveau);
                                if ((!_vQuantifierResult_93_31))
                                {
                                }
                                else
                                {
                                    _vLoopCounter_93_38 = _eSystem._oSucc (_vLoopCounter_93_38);
                                }
                            }
                        }
                        _vQuantifierResult_93_5 = _vQuantifierResult_93_31;
                        if ((!_vQuantifierResult_93_5))
                        {
                        }
                        else
                        {
                            _vLoopCounter_93_12 = _eSystem._oSucc (_vLoopCounter_93_12);
                        }
                    }
                }
                if (!(_vQuantifierResult_93_5)) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:93,5", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
    }

    void _lClassInvariantCheck (String _lArg)
    {
        _lc_RepertoireCours (_lArg);
    }

    public _eMap coursRep;
    public RepertoireCours ()
    {
        super ();
        coursRep = new _eMap ();
        _lc_RepertoireCours ("CheminementProgrammeSolution2_3.pd:111,7");
    }

    public void ajouterRepertoire (int c, Cours _t0c, _eSet pr, Cours _t0pr, int nv)
    {
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:115,10");
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((!coursRep._ovIn (((_eAny) new Cours (c)))))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:117,6");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(pr._oLessLessEq (coursRep.dom (), (_eTemplate_0) null))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:118,7");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_119_4;
                {
                    _vQuantifierResult_119_4 = true;
                    int _vCaptureCount_cp_119_15 = pr._oHash ();
                    int _vLoopCounter_119_11 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_119_11 == _vCaptureCount_cp_119_15) || (!
                            _vQuantifierResult_119_4))) break;
                        _vQuantifierResult_119_4 = (((CoursInfo) coursRep._oIndex (pr._oIndex (
                            _vLoopCounter_119_11))).niveau < nv);
                        if ((!_vQuantifierResult_119_4))
                        {
                        }
                        else
                        {
                            _vLoopCounter_119_11 = _eSystem._oSucc (_vLoopCounter_119_11);
                        }
                    }
                }
                if (!(_vQuantifierResult_119_4)) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:119,4");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        _eMap _vUnshare_121_6 = ((_eMap) coursRep._lClone ());
        coursRep = _vUnshare_121_6;
        _vUnshare_121_6._ir_append (((_eAny) new Cours (c)), (_eRtArrow) null, ((_eAny) new
            CoursInfo (nv, pr, (Cours) null)));
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:121,6");
    }

    public void retirerRepertoire (int c, Cours _t0c)
    {
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:124,10");
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(coursRep._ovIn (((_eAny) new Cours (c))))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:126,7");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        _eMap _vUnshare_128_6 = ((_eMap) coursRep._lClone ());
        coursRep = _vUnshare_128_6;
        _vUnshare_128_6._iz_remove (((_eAny) new Cours (c)));
        {
            _eSet _vCaptureBound_cc_129_32 = coursRep.dom ();
            int _vCaptureCount_cc_129_32 = _vCaptureBound_cc_129_32._oHash ();
            int _vLoopCounter_129_19 = 0;
            for (;;)
            {
                if ((_vLoopCounter_129_19 == _vCaptureCount_cc_129_32)) break;
                _eMap _vUnshare_129_39 = ((_eMap) coursRep._lClone ());
                coursRep = _vUnshare_129_39;
                ((CoursInfo) _vUnshare_129_39._osIndex (_vCaptureBound_cc_129_32._oIndex (
                    _vLoopCounter_129_19))).enleverPrealable (c, (Cours) null);
                _vLoopCounter_129_19 = _eSystem._oSucc (_vLoopCounter_129_19);
            }
        }
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:128,6");
    }

    public void modifierPrealables (int c, Cours _t0c, _eSet pr, Cours _t0pr)
    {
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:132,9");
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(coursRep._ovIn (((_eAny) new Cours (c))))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:134,6");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(pr._oLessLessEq (coursRep.dom (), (_eTemplate_0) null))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:135,7");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_136_4;
                {
                    _vQuantifierResult_136_4 = true;
                    int _vCaptureCount_cp_136_15 = pr._oHash ();
                    int _vLoopCounter_136_11 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_136_11 == _vCaptureCount_cp_136_15) || (!
                            _vQuantifierResult_136_4))) break;
                        _vQuantifierResult_136_4 = (((CoursInfo) coursRep._oIndex (pr._oIndex (
                            _vLoopCounter_136_11))).niveau < ((CoursInfo) coursRep._oIndex (((_eAny)
                            new Cours (c)))).niveau);
                        if ((!_vQuantifierResult_136_4))
                        {
                        }
                        else
                        {
                            _vLoopCounter_136_11 = _eSystem._oSucc (_vLoopCounter_136_11);
                        }
                    }
                }
                if (!(_vQuantifierResult_136_4)) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:136,4");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        _eMap _vUnshare_138_4 = ((_eMap) coursRep._lClone ());
        coursRep = _vUnshare_138_4;
        ((CoursInfo) _vUnshare_138_4._osIndex (((_eAny) new Cours (c)))).modifierPrealablesC (pr, (
            Cours) null);
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:138,16");
    }

    public _eSet _nz_ListeDeCours ()
    {
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:141,1");
        return coursRep.dom ();
    }

    public _eSet prealables (int c, Cours _t0c)
    {
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:144,1");
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(_nz_ListeDeCours ()._ovIn (((_eAny) new Cours (c))))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:145,11");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        return ((CoursInfo) coursRep._oIndex (((_eAny) new Cours (c)))).prealables;
    }

    public boolean _lEqual (RepertoireCours _vArg_88_5)
    {
        if (this == _vArg_88_5)
        {
            return true;
        }
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:88,5");
        return _vArg_88_5.coursRep._lEqual (coursRep);
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == RepertoireCours.class &&
            _lEqual ((RepertoireCours) _lArg));
    }

}

final class Programme extends _eAny
{
    final void _lc_Programme (String _lArg)
    {
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((!obligatoires.empty ()))) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:167,4", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((!optionnels.empty ()))) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:168,4", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((_jCheminementProgrammeSolution2_x5F_3._n_NbCoursReussir < _n_Rep.
                    _nz_ListeDeCours ()._oHash ()))) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:169,22", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(obligatoires._oHashHash (optionnels, (_eTemplate_0) null))) throw new
                    _xClassInvariantItem ("CheminementProgrammeSolution2_3.pd:171,17", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(obligatoires._oLessLess (_n_Rep._nz_ListeDeCours (), (_eTemplate_0) null)))
                    throw new _xClassInvariantItem ("CheminementProgrammeSolution2_3.pd:172,17",
                    _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(optionnels._oLessLess (_n_Rep._nz_ListeDeCours (), (_eTemplate_0) null)))
                    throw new _xClassInvariantItem ("CheminementProgrammeSolution2_3.pd:173,15",
                    _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((obligatoires._oHash () <= _jCheminementProgrammeSolution2_x5F_3.
                    _n_MaxObligatoires))) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:174,18", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((_jCheminementProgrammeSolution2_x5F_3._n_MinObligatoires <= obligatoires.
                    _oHash ()))) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:175,18", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((_jCheminementProgrammeSolution2_x5F_3._n_MinOptionnels <= optionnels._oHash ()
                    ))) throw new _xClassInvariantItem ("CheminementProgrammeSolution2_3.pd:176,16",
                    _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((_jCheminementProgrammeSolution2_x5F_3._n_NbCoursReussir < (obligatoires.
                    _oHash () + optionnels._oHash ())))) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:177,30", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_178_4;
                {
                    _vQuantifierResult_178_4 = true;
                    int _vCaptureCount_c_178_14 = optionnels._oHash ();
                    int _vLoopCounter_178_11 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_178_11 == _vCaptureCount_c_178_14) || (!
                            _vQuantifierResult_178_4))) break;
                        boolean _vQuantifierResult_178_29;
                        {
                            _eSet _vCaptureBound_cp_178_45 = _n_Rep.prealables (((Cours) optionnels.
                                _oIndex (_vLoopCounter_178_11)).value, (Cours) null);
                            _vQuantifierResult_178_29 = true;
                            int _vCaptureCount_cp_178_45 = _vCaptureBound_cp_178_45._oHash ();
                            int _vLoopCounter_178_37 = 0;
                            for (;;)
                            {
                                if (((_vLoopCounter_178_37 == _vCaptureCount_cp_178_45) || (!
                                    _vQuantifierResult_178_29))) break;
                                _vQuantifierResult_178_29 = obligatoires._oPlusPlus (optionnels, (
                                    _eTemplate_0) null)._ovIn (_vCaptureBound_cp_178_45._oIndex (
                                    _vLoopCounter_178_37));
                                if ((!_vQuantifierResult_178_29))
                                {
                                }
                                else
                                {
                                    _vLoopCounter_178_37 = _eSystem._oSucc (_vLoopCounter_178_37);
                                }
                            }
                        }
                        _vQuantifierResult_178_4 = _vQuantifierResult_178_29;
                        if ((!_vQuantifierResult_178_4))
                        {
                        }
                        else
                        {
                            _vLoopCounter_178_11 = _eSystem._oSucc (_vLoopCounter_178_11);
                        }
                    }
                }
                if (!(_vQuantifierResult_178_4)) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:178,4", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_179_4;
                {
                    _vQuantifierResult_179_4 = true;
                    int _vCaptureCount_c_179_14 = obligatoires._oHash ();
                    int _vLoopCounter_179_11 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_179_11 == _vCaptureCount_c_179_14) || (!
                            _vQuantifierResult_179_4))) break;
                        boolean _vQuantifierResult_179_30;
                        {
                            _eSet _vCaptureBound_cp_179_46 = _n_Rep.prealables (((Cours)
                                obligatoires._oIndex (_vLoopCounter_179_11)).value, (Cours) null);
                            _vQuantifierResult_179_30 = true;
                            int _vCaptureCount_cp_179_46 = _vCaptureBound_cp_179_46._oHash ();
                            int _vLoopCounter_179_38 = 0;
                            for (;;)
                            {
                                if (((_vLoopCounter_179_38 == _vCaptureCount_cp_179_46) || (!
                                    _vQuantifierResult_179_30))) break;
                                _vQuantifierResult_179_30 = obligatoires._ovIn (
                                    _vCaptureBound_cp_179_46._oIndex (_vLoopCounter_179_38));
                                if ((!_vQuantifierResult_179_30))
                                {
                                }
                                else
                                {
                                    _vLoopCounter_179_38 = _eSystem._oSucc (_vLoopCounter_179_38);
                                }
                            }
                        }
                        _vQuantifierResult_179_4 = _vQuantifierResult_179_30;
                        if ((!_vQuantifierResult_179_4))
                        {
                        }
                        else
                        {
                            _vLoopCounter_179_11 = _eSystem._oSucc (_vLoopCounter_179_11);
                        }
                    }
                }
                if (!(_vQuantifierResult_179_4)) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:179,4", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
    }

    void _lClassInvariantCheck (String _lArg)
    {
        _lc_Programme (_lArg);
    }

    public _eSet obligatoires;
    public _eSet optionnels;
    public RepertoireCours _n_Rep;
    public _eSet _nz_CoursDuProgramme ()
    {
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:188,3");
        return obligatoires._oPlusPlus (optionnels, (_eTemplate_0) null);
    }

    public Programme (_eSet _vobligatoires, Cours _t0_vobligatoires, _eSet _voptionnels, Cours
        _t0_voptionnels, RepertoireCours _vRep)
    {
        super ();
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((!_vobligatoires.empty ()))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:197,4");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((!_voptionnels.empty ()))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:198,4");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((_jCheminementProgrammeSolution2_x5F_3._n_NbCoursReussir < _vRep.
                    _nz_ListeDeCours ()._oHash ()))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:199,23");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(_vobligatoires._oHashHash (_voptionnels, (_eTemplate_0) null))) throw new
                    _xPre ("CheminementProgrammeSolution2_3.pd:202,17");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(_vobligatoires._oLessLess (_vRep._nz_ListeDeCours (), (_eTemplate_0) null)))
                    throw new _xPre ("CheminementProgrammeSolution2_3.pd:203,17");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(_voptionnels._oLessLess (_vRep._nz_ListeDeCours (), (_eTemplate_0) null)))
                    throw new _xPre ("CheminementProgrammeSolution2_3.pd:204,15");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((_vobligatoires._oHash () <= _jCheminementProgrammeSolution2_x5F_3.
                    _n_MaxObligatoires))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:205,18");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((_jCheminementProgrammeSolution2_x5F_3._n_MinObligatoires <= _vobligatoires.
                    _oHash ()))) throw new _xPre ("CheminementProgrammeSolution2_3.pd:206,18");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((_jCheminementProgrammeSolution2_x5F_3._n_MinOptionnels <= _voptionnels._oHash
                    ()))) throw new _xPre ("CheminementProgrammeSolution2_3.pd:207,16");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((_jCheminementProgrammeSolution2_x5F_3._n_NbCoursReussir < (_vobligatoires.
                    _oHash () + _voptionnels._oHash ())))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:208,30");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_211_4;
                {
                    _vQuantifierResult_211_4 = true;
                    int _vCaptureCount_c_211_14 = _voptionnels._oHash ();
                    int _vLoopCounter_211_11 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_211_11 == _vCaptureCount_c_211_14) || (!
                            _vQuantifierResult_211_4))) break;
                        _vQuantifierResult_211_4 = _vRep.prealables (((Cours) _voptionnels._oIndex (
                            _vLoopCounter_211_11)).value, (Cours) null)._oLessLessEq (_vobligatoires
                            ._oPlusPlus (_voptionnels, (_eTemplate_0) null), (_eTemplate_0) null);
                        if ((!_vQuantifierResult_211_4))
                        {
                        }
                        else
                        {
                            _vLoopCounter_211_11 = _eSystem._oSucc (_vLoopCounter_211_11);
                        }
                    }
                }
                if (!(_vQuantifierResult_211_4)) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:211,4");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_213_4;
                {
                    _vQuantifierResult_213_4 = true;
                    int _vCaptureCount_c_213_14 = _vobligatoires._oHash ();
                    int _vLoopCounter_213_11 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_213_11 == _vCaptureCount_c_213_14) || (!
                            _vQuantifierResult_213_4))) break;
                        _vQuantifierResult_213_4 = _vRep.prealables (((Cours) _vobligatoires._oIndex
                            (_vLoopCounter_213_11)).value, (Cours) null)._oLessLessEq (
                            _vobligatoires, (_eTemplate_0) null);
                        if ((!_vQuantifierResult_213_4))
                        {
                        }
                        else
                        {
                            _vLoopCounter_213_11 = _eSystem._oSucc (_vLoopCounter_213_11);
                        }
                    }
                }
                if (!(_vQuantifierResult_213_4)) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:213,4");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        obligatoires = _vobligatoires;
        optionnels = _voptionnels;
        _n_Rep = _vRep;
        _lc_Programme ("CheminementProgrammeSolution2_3.pd:195,1");
    }

    public void ajouterObligatoire (int c, Cours _t0c)
    {
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:216,10");
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(_n_Rep._nz_ListeDeCours ()._ovIn (((_eAny) new Cours (c))))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:218,6");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((!_nz_CoursDuProgramme ()._ovIn (((_eAny) new Cours (c)))))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:219,6");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(obligatoires.append (((_eAny) new Cours (c)))._oLessLess (_n_Rep.
                    _nz_ListeDeCours (), (_eTemplate_0) null))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:220,27");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((obligatoires._oHash () < _jCheminementProgrammeSolution2_x5F_3.
                    _n_MaxObligatoires))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:221,18");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(_n_Rep.prealables (c, (Cours) null)._oLessLessEq (obligatoires, (_eTemplate_0)
                    null))) throw new _xPre ("CheminementProgrammeSolution2_3.pd:224,22");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        _eSet _vUnshare_227_6 = ((_eSet) obligatoires._lClone ());
        obligatoires = _vUnshare_227_6;
        _vUnshare_227_6._iz_append (((_eAny) new Cours (c)));
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:227,6");
    }

    public void retirerObligatoire (int c, Cours _t0c)
    {
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:229,10");
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(obligatoires._ovIn (((_eAny) new Cours (c))))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:231,6");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((_jCheminementProgrammeSolution2_x5F_3._n_MinObligatoires < obligatoires.
                    _oHash ()))) throw new _xPre ("CheminementProgrammeSolution2_3.pd:232,18");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(((1 + _jCheminementProgrammeSolution2_x5F_3._n_NbCoursReussir) <
                    _nz_CoursDuProgramme ()._oHash ()))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:233,22");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_235_4;
                {
                    _eSet _vCaptureBound_x_235_31 = _nz_CoursDuProgramme ().remove (((_eAny) new
                        Cours (c)));
                    _vQuantifierResult_235_4 = true;
                    int _vCaptureCount_x_235_31 = _vCaptureBound_x_235_31._oHash ();
                    int _vLoopCounter_235_11 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_235_11 == _vCaptureCount_x_235_31) || (!
                            _vQuantifierResult_235_4))) break;
                        _vQuantifierResult_235_4 = (!_n_Rep.prealables (((Cours)
                            _vCaptureBound_x_235_31._oIndex (_vLoopCounter_235_11)).value, (Cours)
                            null)._ovIn (((_eAny) new Cours (c))));
                        if ((!_vQuantifierResult_235_4))
                        {
                        }
                        else
                        {
                            _vLoopCounter_235_11 = _eSystem._oSucc (_vLoopCounter_235_11);
                        }
                    }
                }
                if (!(_vQuantifierResult_235_4)) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:235,4");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        _eSet _vUnshare_238_6 = ((_eSet) obligatoires._lClone ());
        obligatoires = _vUnshare_238_6;
        _vUnshare_238_6._iz_remove (((_eAny) new Cours (c)));
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:238,6");
    }

    public void ajouterOptionnel (int c, Cours _t0c)
    {
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:241,9");
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(_n_Rep._nz_ListeDeCours ()._ovIn (((_eAny) new Cours (c))))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:243,6");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((!_nz_CoursDuProgramme ()._ovIn (((_eAny) new Cours (c)))))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:244,6");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(_n_Rep.prealables (c, (Cours) null)._oLessLessEq (obligatoires._oPlusPlus (
                    optionnels, (_eTemplate_0) null), (_eTemplate_0) null))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:247,22");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        _eSet _vUnshare_250_6 = ((_eSet) optionnels._lClone ());
        optionnels = _vUnshare_250_6;
        _vUnshare_250_6._iz_append (((_eAny) new Cours (c)));
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:250,6");
    }

    public void retirerOptionnel (int c, Cours _t0c)
    {
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:254,9");
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(optionnels._ovIn (((_eAny) new Cours (c))))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:256,6");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((_jCheminementProgrammeSolution2_x5F_3._n_MinOptionnels < optionnels._oHash ())
                    )) throw new _xPre ("CheminementProgrammeSolution2_3.pd:257,16");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(((1 + _jCheminementProgrammeSolution2_x5F_3._n_NbCoursReussir) <
                    _nz_CoursDuProgramme ()._oHash ()))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:258,24");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_261_4;
                {
                    _eSet _vCaptureBound_x_261_31 = _nz_CoursDuProgramme ().remove (((_eAny) new
                        Cours (c)));
                    _vQuantifierResult_261_4 = true;
                    int _vCaptureCount_x_261_31 = _vCaptureBound_x_261_31._oHash ();
                    int _vLoopCounter_261_11 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_261_11 == _vCaptureCount_x_261_31) || (!
                            _vQuantifierResult_261_4))) break;
                        _vQuantifierResult_261_4 = (!_n_Rep.prealables (((Cours)
                            _vCaptureBound_x_261_31._oIndex (_vLoopCounter_261_11)).value, (Cours)
                            null)._ovIn (((_eAny) new Cours (c))));
                        if ((!_vQuantifierResult_261_4))
                        {
                        }
                        else
                        {
                            _vLoopCounter_261_11 = _eSystem._oSucc (_vLoopCounter_261_11);
                        }
                    }
                }
                if (!(_vQuantifierResult_261_4)) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:261,4");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        _eSet _vUnshare_264_6 = ((_eSet) optionnels._lClone ());
        optionnels = _vUnshare_264_6;
        _vUnshare_264_6._iz_remove (((_eAny) new Cours (c)));
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:264,6");
    }

    public void remplacerObligatoire (int c1, Cours _t0c1, int c2, Cours _t0c2)
    {
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:268,9");
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((!(c1 == c2)))) throw new _xPre ("CheminementProgrammeSolution2_3.pd:270,7");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(_n_Rep._nz_ListeDeCours ()._ovIn (((_eAny) new Cours (c2))))) throw new _xPre
                    ("CheminementProgrammeSolution2_3.pd:271,7");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(obligatoires._ovIn (((_eAny) new Cours (c1))))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:272,7");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((!_nz_CoursDuProgramme ()._ovIn (((_eAny) new Cours (c2)))))) throw new _xPre
                    ("CheminementProgrammeSolution2_3.pd:273,7");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((2 < (_n_Rep._nz_ListeDeCours ()._oHash () - _nz_CoursDuProgramme ()._oHash ())
                    ))) throw new _xPre ("CheminementProgrammeSolution2_3.pd:274,42");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_275_4;
                {
                    _eSet _vCaptureBound_cp_275_19 = _n_Rep.prealables (c2, (Cours) null);
                    _vQuantifierResult_275_4 = true;
                    int _vCaptureCount_cp_275_19 = _vCaptureBound_cp_275_19._oHash ();
                    int _vLoopCounter_275_11 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_275_11 == _vCaptureCount_cp_275_19) || (!
                            _vQuantifierResult_275_4))) break;
                        _vQuantifierResult_275_4 = obligatoires.remove (((_eAny) new Cours (c1))).
                            _ovIn (_vCaptureBound_cp_275_19._oIndex (_vLoopCounter_275_11));
                        if ((!_vQuantifierResult_275_4))
                        {
                        }
                        else
                        {
                            _vLoopCounter_275_11 = _eSystem._oSucc (_vLoopCounter_275_11);
                        }
                    }
                }
                if (!(_vQuantifierResult_275_4)) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:275,4");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_276_4;
                {
                    _vQuantifierResult_276_4 = true;
                    int _vCaptureCount_c_276_14 = optionnels._oHash ();
                    int _vLoopCounter_276_11 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_276_11 == _vCaptureCount_c_276_14) || (!
                            _vQuantifierResult_276_4))) break;
                        _vQuantifierResult_276_4 = (!_n_Rep.prealables (((Cours) optionnels._oIndex
                            (_vLoopCounter_276_11)).value, (Cours) null)._ovIn (((_eAny) new Cours (
                            c1))));
                        if ((!_vQuantifierResult_276_4))
                        {
                        }
                        else
                        {
                            _vLoopCounter_276_11 = _eSystem._oSucc (_vLoopCounter_276_11);
                        }
                    }
                }
                if (!(_vQuantifierResult_276_4)) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:276,4");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_277_4;
                {
                    _vQuantifierResult_277_4 = true;
                    int _vCaptureCount_c_277_14 = obligatoires._oHash ();
                    int _vLoopCounter_277_11 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_277_11 == _vCaptureCount_c_277_14) || (!
                            _vQuantifierResult_277_4))) break;
                        _vQuantifierResult_277_4 = (!_n_Rep.prealables (((Cours) obligatoires.
                            _oIndex (_vLoopCounter_277_11)).value, (Cours) null)._ovIn (((_eAny) new
                            Cours (c1))));
                        if ((!_vQuantifierResult_277_4))
                        {
                        }
                        else
                        {
                            _vLoopCounter_277_11 = _eSystem._oSucc (_vLoopCounter_277_11);
                        }
                    }
                }
                if (!(_vQuantifierResult_277_4)) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:277,4");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        obligatoires = obligatoires.remove (((_eAny) new Cours (c1))).append (((_eAny) new Cours (c2)
            ));
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:283,6");
    }

    public void echangerObOpt (int c1, Cours _t0c1, int c2, Cours _t0c2)
    {
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:287,9");
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((!(c1 == c2)))) throw new _xPre ("CheminementProgrammeSolution2_3.pd:289,8");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(obligatoires._ovIn (((_eAny) new Cours (c1))))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:290,8");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(optionnels._ovIn (((_eAny) new Cours (c2))))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:291,8");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_292_4;
                {
                    _eSet _vCaptureBound_cp_292_19 = _n_Rep.prealables (c2, (Cours) null);
                    _vQuantifierResult_292_4 = true;
                    int _vCaptureCount_cp_292_19 = _vCaptureBound_cp_292_19._oHash ();
                    int _vLoopCounter_292_11 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_292_11 == _vCaptureCount_cp_292_19) || (!
                            _vQuantifierResult_292_4))) break;
                        _vQuantifierResult_292_4 = obligatoires.remove (((_eAny) new Cours (c1))).
                            _ovIn (_vCaptureBound_cp_292_19._oIndex (_vLoopCounter_292_11));
                        if ((!_vQuantifierResult_292_4))
                        {
                        }
                        else
                        {
                            _vLoopCounter_292_11 = _eSystem._oSucc (_vLoopCounter_292_11);
                        }
                    }
                }
                if (!(_vQuantifierResult_292_4)) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:292,4");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((_jCheminementProgrammeSolution2_x5F_3._n_MinOptionnels < optionnels._oHash ())
                    )) throw new _xPre ("CheminementProgrammeSolution2_3.pd:293,16");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_294_4;
                {
                    _vQuantifierResult_294_4 = true;
                    int _vCaptureCount_c_294_14 = optionnels._oHash ();
                    int _vLoopCounter_294_11 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_294_11 == _vCaptureCount_c_294_14) || (!
                            _vQuantifierResult_294_4))) break;
                        _vQuantifierResult_294_4 = (!_n_Rep.prealables (((Cours) optionnels._oIndex
                            (_vLoopCounter_294_11)).value, (Cours) null)._ovIn (((_eAny) new Cours (
                            c1))));
                        if ((!_vQuantifierResult_294_4))
                        {
                        }
                        else
                        {
                            _vLoopCounter_294_11 = _eSystem._oSucc (_vLoopCounter_294_11);
                        }
                    }
                }
                if (!(_vQuantifierResult_294_4)) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:294,4");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_295_4;
                {
                    _vQuantifierResult_295_4 = true;
                    int _vCaptureCount_c_295_14 = obligatoires._oHash ();
                    int _vLoopCounter_295_11 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_295_11 == _vCaptureCount_c_295_14) || (!
                            _vQuantifierResult_295_4))) break;
                        _vQuantifierResult_295_4 = (!_n_Rep.prealables (((Cours) obligatoires.
                            _oIndex (_vLoopCounter_295_11)).value, (Cours) null)._ovIn (((_eAny) new
                            Cours (c1))));
                        if ((!_vQuantifierResult_295_4))
                        {
                        }
                        else
                        {
                            _vLoopCounter_295_11 = _eSystem._oSucc (_vLoopCounter_295_11);
                        }
                    }
                }
                if (!(_vQuantifierResult_295_4)) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:295,4");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        obligatoires = obligatoires.remove (((_eAny) new Cours (c1))).append (((_eAny) new Cours (c2)
            ));
        optionnels = optionnels.remove (((_eAny) new Cours (c2))).append (((_eAny) new Cours (c1)));
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:301,6");
    }

    public boolean _lEqual (Programme _vArg_162_3)
    {
        if (this == _vArg_162_3)
        {
            return true;
        }
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:162,3");
        return ((_vArg_162_3.obligatoires._lEqual (obligatoires) && _vArg_162_3.optionnels._lEqual (
            optionnels)) && _vArg_162_3._n_Rep._lEqual (_n_Rep));
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == Programme.class && _lEqual ((
            Programme) _lArg));
    }

}

final class CheminementSuggere extends _eAny
{
    final void _lc_CheminementSuggere (String _lArg)
    {
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(p.obligatoires._oPlusPlus (p.optionnels, (_eTemplate_0) null)._lEqual (sess.
                    dom ()))) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:326,31", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(p.obligatoires._oPlusPlus (p.optionnels, (_eTemplate_0) null)._lEqual (proj.
                    dom ()))) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:327,31", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((50 <= (p.obligatoires._oHash () + p.optionnels._oHash ())))) throw new
                    _xClassInvariantItem ("CheminementProgrammeSolution2_3.pd:329,32", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                _eSet _vThose_344_4 = new _eSet ();
                {
                    _eSet _vCaptureBound_c_344_14 = p.obligatoires._oPlusPlus (p.optionnels, (
                        _eTemplate_0) null);
                    int _vCaptureCount_c_344_14 = _vCaptureBound_c_344_14._oHash ();
                    int _vLoopCounter_344_11 = 0;
                    for (;;)
                    {
                        if ((_vLoopCounter_344_11 == _vCaptureCount_c_344_14)) break;
                        if (p._n_Rep.prealables (((Cours) _vCaptureBound_c_344_14._oIndex (
                            _vLoopCounter_344_11)).value, (Cours) null).empty ())
                        {
                            _vThose_344_4 = _vThose_344_4.append (_vCaptureBound_c_344_14._oIndex (
                                _vLoopCounter_344_11));
                        }
                        else
                        {
                        }
                        _vLoopCounter_344_11 = _eSystem._oSucc (_vLoopCounter_344_11);
                    }
                }
                if (!((10 <= _vThose_344_4._oHash ()))) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:345,34", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                _eSet _vThose_368_3 = new _eSet ();
                {
                    int _vCaptureCount_c_368_15 = p.obligatoires._oHash ();
                    int _vLoopCounter_368_10 = 0;
                    for (;;)
                    {
                        if ((_vLoopCounter_368_10 == _vCaptureCount_c_368_15)) break;
                        if (((_eWrapper_bool) proj._oIndex (p.obligatoires._oIndex (
                            _vLoopCounter_368_10))).value)
                        {
                            _vThose_368_3 = _vThose_368_3.append (p.obligatoires._oIndex (
                                _vLoopCounter_368_10));
                        }
                        else
                        {
                        }
                        _vLoopCounter_368_10 = _eSystem._oSucc (_vLoopCounter_368_10);
                    }
                }
                if (!((_vThose_368_3._oHash () <= 3))) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:368,40", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
    }

    void _lClassInvariantCheck (String _lArg)
    {
        _lc_CheminementSuggere (_lArg);
    }

    public Programme p;
    public _eMap sess;
    public _eMap proj;
    public _eMap _n_ChemS;
    public CheminementSuggere (Programme _vp, _eMap _vsess, Cours _t0_vsess, int _t1_vsess, _eMap
        _vproj, Cours _t0_vproj, boolean _t1_vproj, _eMap _vChemS, int _t0_vChemS, _eSet _t1_vChemS,
        Cours _t2_vChemS)
    {
        super ();
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(_vp.obligatoires._oPlusPlus (_vp.optionnels, (_eTemplate_0) null)._lEqual (
                    _vsess.dom ()))) throw new _xPre ("CheminementProgrammeSolution2_3.pd:380,31");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(_vp.obligatoires._oPlusPlus (_vp.optionnels, (_eTemplate_0) null)._lEqual (
                    _vproj.dom ()))) throw new _xPre ("CheminementProgrammeSolution2_3.pd:381,31");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((50 <= (_vp.obligatoires._oHash () + _vp.optionnels._oHash ())))) throw new
                    _xPre ("CheminementProgrammeSolution2_3.pd:383,32");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                _eSet _vThose_398_4 = new _eSet ();
                {
                    _eSet _vCaptureBound_c_398_14 = _vp.obligatoires._oPlusPlus (_vp.optionnels, (
                        _eTemplate_0) null);
                    int _vCaptureCount_c_398_14 = _vCaptureBound_c_398_14._oHash ();
                    int _vLoopCounter_398_11 = 0;
                    for (;;)
                    {
                        if ((_vLoopCounter_398_11 == _vCaptureCount_c_398_14)) break;
                        if (_vp._n_Rep.prealables (((Cours) _vCaptureBound_c_398_14._oIndex (
                            _vLoopCounter_398_11)).value, (Cours) null).empty ())
                        {
                            _vThose_398_4 = _vThose_398_4.append (_vCaptureBound_c_398_14._oIndex (
                                _vLoopCounter_398_11));
                        }
                        else
                        {
                        }
                        _vLoopCounter_398_11 = _eSystem._oSucc (_vLoopCounter_398_11);
                    }
                }
                if (!((10 <= _vThose_398_4._oHash ()))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:399,34");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                _eSet _vThose_422_3 = new _eSet ();
                {
                    int _vCaptureCount_c_422_15 = _vp.obligatoires._oHash ();
                    int _vLoopCounter_422_10 = 0;
                    for (;;)
                    {
                        if ((_vLoopCounter_422_10 == _vCaptureCount_c_422_15)) break;
                        if (((_eWrapper_bool) _vproj._oIndex (_vp.obligatoires._oIndex (
                            _vLoopCounter_422_10))).value)
                        {
                            _vThose_422_3 = _vThose_422_3.append (_vp.obligatoires._oIndex (
                                _vLoopCounter_422_10));
                        }
                        else
                        {
                        }
                        _vLoopCounter_422_10 = _eSystem._oSucc (_vLoopCounter_422_10);
                    }
                }
                if (!((_vThose_422_3._oHash () <= 3))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:422,40");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        p = _vp;
        sess = _vsess;
        proj = _vproj;
        _n_ChemS = _vChemS;
        _lc_CheminementSuggere ("CheminementProgrammeSolution2_3.pd:376,1");
    }

    public boolean _lEqual (CheminementSuggere _vArg_318_3)
    {
        if (this == _vArg_318_3)
        {
            return true;
        }
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:318,3");
        return (((_vArg_318_3.p._lEqual (p) && _vArg_318_3.sess._lEqual (sess)) && _vArg_318_3.proj.
            _lEqual (proj)) && _vArg_318_3._n_ChemS._lEqual (_n_ChemS));
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == CheminementSuggere.class &&
            _lEqual ((CheminementSuggere) _lArg));
    }

}

class VerifChemPers extends _eAny
{
    final void _lc_VerifChemPers (String _lArg)
    {
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((1 < sPr))) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:454,5", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((sPr <= sF))) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:455,4", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((sF <= _jCheminementProgrammeSolution2_x5F_3._n_SessMaxE))) throw new
                    _xClassInvariantItem ("CheminementProgrammeSolution2_3.pd:456,4", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_459_3;
                {
                    _vQuantifierResult_459_3 = false;
                    int _vCaptureCount_c_459_16 = p.obligatoires._oHash ();
                    int _vLoopCounter_459_11 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_459_11 == _vCaptureCount_c_459_16) ||
                            _vQuantifierResult_459_3)) break;
                        _vQuantifierResult_459_3 = (!reussis._ovIn (p.obligatoires._oIndex (
                            _vLoopCounter_459_11)));
                        if (_vQuantifierResult_459_3)
                        {
                        }
                        else
                        {
                            _vLoopCounter_459_11 = _eSystem._oSucc (_vLoopCounter_459_11);
                        }
                    }
                }
                if (!((_vQuantifierResult_459_3 || ((p.optionnels._oStarStar (reussis, (_eTemplate_0)
                    null)._oHash () + p.obligatoires._oHash ()) <
                    _jCheminementProgrammeSolution2_x5F_3._n_NbCoursReussir)))) throw new
                    _xClassInvariantItem ("CheminementProgrammeSolution2_3.pd:459,3", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(reussis._oLessLessEq (p._n_Rep._nz_ListeDeCours (), (_eTemplate_0) null)))
                    throw new _xClassInvariantItem ("CheminementProgrammeSolution2_3.pd:462,9",
                    _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((!p.obligatoires._oPlusPlus (p.optionnels, (_eTemplate_0) null)._oStarStar (
                    reussis, (_eTemplate_0) null).empty ()))) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:463,1", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_464_1;
                {
                    _vQuantifierResult_464_1 = true;
                    int _vLoopCounter_464_8 = sPr;
                    for (;;)
                    {
                        if (((sF < _vLoopCounter_464_8) || (!_vQuantifierResult_464_1))) break;
                        if (_eSystem.enableConstraint && _eSystem.currentCheckNesting <= _eSystem.
                            maxCheckNesting)
                        {
                            _eSystem.currentCheckNesting ++;
                            try
                            {
                                if (!(_eSystem._oRange (1, _jCheminementProgrammeSolution2_x5F_3.
                                    _n_SessMaxE)._ovIn (((_eAny) new _eWrapper_int (
                                    _vLoopCounter_464_8))))) throw new _xConstraint (
                                    "CheminementProgrammeSolution2_3.pd:56,23");
                            }
                            catch (_xCannotEvaluate _lException)
                            {
                            }
                            _eSystem.currentCheckNesting --;
                        }
                        _vQuantifierResult_464_1 = chemP.dom ()._ovIn (((_eAny) new _eWrapper_int (
                            _vLoopCounter_464_8)));
                        if ((!_vQuantifierResult_464_1))
                        {
                        }
                        else
                        {
                            _vLoopCounter_464_8 = _eSystem._oSucc (_vLoopCounter_464_8);
                        }
                    }
                }
                if (!(_vQuantifierResult_464_1)) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:464,1", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_465_1;
                {
                    _vQuantifierResult_465_1 = true;
                    int _vLoopCounter_465_8 = sPr;
                    for (;;)
                    {
                        if (((sF < _vLoopCounter_465_8) || (!_vQuantifierResult_465_1))) break;
                        if (_eSystem.enableConstraint && _eSystem.currentCheckNesting <= _eSystem.
                            maxCheckNesting)
                        {
                            _eSystem.currentCheckNesting ++;
                            try
                            {
                                if (!(_eSystem._oRange (1, _jCheminementProgrammeSolution2_x5F_3.
                                    _n_SessMaxE)._ovIn (((_eAny) new _eWrapper_int (
                                    _vLoopCounter_465_8))))) throw new _xConstraint (
                                    "CheminementProgrammeSolution2_3.pd:56,23");
                            }
                            catch (_xCannotEvaluate _lException)
                            {
                            }
                            _eSystem.currentCheckNesting --;
                        }
                        _vQuantifierResult_465_1 = chemOk.dom ()._ovIn (((_eAny) new _eWrapper_int (
                            _vLoopCounter_465_8)));
                        if ((!_vQuantifierResult_465_1))
                        {
                        }
                        else
                        {
                            _vLoopCounter_465_8 = _eSystem._oSucc (_vLoopCounter_465_8);
                        }
                    }
                }
                if (!(_vQuantifierResult_465_1)) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:465,1", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(p.obligatoires._oPlusPlus (p.optionnels, (_eTemplate_0) null)._lEqual (sess.
                    dom ()))) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:468,31", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(p.obligatoires._oPlusPlus (p.optionnels, (_eTemplate_0) null)._lEqual (proj.
                    dom ()))) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:469,31", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((50 <= (p.obligatoires._oHash () + p.optionnels._oHash ())))) throw new
                    _xClassInvariantItem ("CheminementProgrammeSolution2_3.pd:471,32", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_475_2;
                {
                    _eSet _vCaptureBound_c_475_14 = p._nz_CoursDuProgramme ();
                    _vQuantifierResult_475_2 = true;
                    int _vCaptureCount_c_475_14 = _vCaptureBound_c_475_14._oHash ();
                    int _vLoopCounter_475_9 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_475_9 == _vCaptureCount_c_475_14) || (!
                            _vQuantifierResult_475_2))) break;
                        _vQuantifierResult_475_2 = (sess.dom ()._ovIn (_vCaptureBound_c_475_14.
                            _oIndex (_vLoopCounter_475_9)) && proj.dom ()._ovIn (
                            _vCaptureBound_c_475_14._oIndex (_vLoopCounter_475_9)));
                        if ((!_vQuantifierResult_475_2))
                        {
                        }
                        else
                        {
                            _vLoopCounter_475_9 = _eSystem._oSucc (_vLoopCounter_475_9);
                        }
                    }
                }
                if (!(_vQuantifierResult_475_2)) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:475,2", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                _eSet _vThose_481_4 = new _eSet ();
                {
                    _eSet _vCaptureBound_c_481_14 = p.obligatoires._oPlusPlus (p.optionnels, (
                        _eTemplate_0) null);
                    int _vCaptureCount_c_481_14 = _vCaptureBound_c_481_14._oHash ();
                    int _vLoopCounter_481_11 = 0;
                    for (;;)
                    {
                        if ((_vLoopCounter_481_11 == _vCaptureCount_c_481_14)) break;
                        if (p._n_Rep.prealables (((Cours) _vCaptureBound_c_481_14._oIndex (
                            _vLoopCounter_481_11)).value, (Cours) null).empty ())
                        {
                            _vThose_481_4 = _vThose_481_4.append (_vCaptureBound_c_481_14._oIndex (
                                _vLoopCounter_481_11));
                        }
                        else
                        {
                        }
                        _vLoopCounter_481_11 = _eSystem._oSucc (_vLoopCounter_481_11);
                    }
                }
                if (!((10 <= _vThose_481_4._oHash ()))) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:482,34", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enableClassInvariantItem && _eSystem.currentCheckNesting <= _eSystem.
            maxCheckNesting && _eSystem.currentSuperNesting == 0)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                _eSet _vThose_497_3 = new _eSet ();
                {
                    int _vCaptureCount_c_497_15 = p.obligatoires._oHash ();
                    int _vLoopCounter_497_10 = 0;
                    for (;;)
                    {
                        if ((_vLoopCounter_497_10 == _vCaptureCount_c_497_15)) break;
                        if (((_eWrapper_bool) proj._oIndex (p.obligatoires._oIndex (
                            _vLoopCounter_497_10))).value)
                        {
                            _vThose_497_3 = _vThose_497_3.append (p.obligatoires._oIndex (
                                _vLoopCounter_497_10));
                        }
                        else
                        {
                        }
                        _vLoopCounter_497_10 = _eSystem._oSucc (_vLoopCounter_497_10);
                    }
                }
                if (!((_vThose_497_3._oHash () <= 3))) throw new _xClassInvariantItem (
                    "CheminementProgrammeSolution2_3.pd:497,40", _lArg);
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
    }

    protected void _lClassInvariantCheck (String _lArg)
    {
        _lc_VerifChemPers (_lArg);
    }

    protected int sPr;
    protected int sF;
    protected _eSet reussis;
    protected _eMap chemP;
    protected _eMap chemOk;
    protected Programme p;
    protected _eMap sess;
    protected _eMap proj;
    public VerifChemPers (_eMap cP, int _t0cP, _eSet _t1cP, Cours _t2cP, _eMap cOk, int _t0cOk,
        boolean _t1cOk, _eSet _vreussis, Cours _t0_vreussis, Programme _vp, int _vsPr, int _vsF,
        _eMap _vsess, Cours _t0_vsess, int _t1_vsess, _eMap _vproj, Cours _t0_vproj, boolean
        _t1_vproj)
    {
        super ();
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_516_1;
                {
                    _vQuantifierResult_516_1 = true;
                    int _vLoopCounter_516_8 = _vsPr;
                    for (;;)
                    {
                        if (((_vsF < _vLoopCounter_516_8) || (!_vQuantifierResult_516_1))) break;
                        if (_eSystem.enableConstraint && _eSystem.currentCheckNesting <= _eSystem.
                            maxCheckNesting)
                        {
                            _eSystem.currentCheckNesting ++;
                            try
                            {
                                if (!(_eSystem._oRange (1, _jCheminementProgrammeSolution2_x5F_3.
                                    _n_SessMaxE)._ovIn (((_eAny) new _eWrapper_int (
                                    _vLoopCounter_516_8))))) throw new _xConstraint (
                                    "CheminementProgrammeSolution2_3.pd:56,23");
                            }
                            catch (_xCannotEvaluate _lException)
                            {
                            }
                            _eSystem.currentCheckNesting --;
                        }
                        _vQuantifierResult_516_1 = cP.dom ()._ovIn (((_eAny) new _eWrapper_int (
                            _vLoopCounter_516_8)));
                        if ((!_vQuantifierResult_516_1))
                        {
                        }
                        else
                        {
                            _vLoopCounter_516_8 = _eSystem._oSucc (_vLoopCounter_516_8);
                        }
                    }
                }
                if (!(_vQuantifierResult_516_1)) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:516,1");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_517_1;
                {
                    _vQuantifierResult_517_1 = true;
                    int _vLoopCounter_517_8 = _vsPr;
                    for (;;)
                    {
                        if (((_vsF < _vLoopCounter_517_8) || (!_vQuantifierResult_517_1))) break;
                        if (_eSystem.enableConstraint && _eSystem.currentCheckNesting <= _eSystem.
                            maxCheckNesting)
                        {
                            _eSystem.currentCheckNesting ++;
                            try
                            {
                                if (!(_eSystem._oRange (1, _jCheminementProgrammeSolution2_x5F_3.
                                    _n_SessMaxE)._ovIn (((_eAny) new _eWrapper_int (
                                    _vLoopCounter_517_8))))) throw new _xConstraint (
                                    "CheminementProgrammeSolution2_3.pd:56,23");
                            }
                            catch (_xCannotEvaluate _lException)
                            {
                            }
                            _eSystem.currentCheckNesting --;
                        }
                        _vQuantifierResult_517_1 = cOk.dom ()._ovIn (((_eAny) new _eWrapper_int (
                            _vLoopCounter_517_8)));
                        if ((!_vQuantifierResult_517_1))
                        {
                        }
                        else
                        {
                            _vLoopCounter_517_8 = _eSystem._oSucc (_vLoopCounter_517_8);
                        }
                    }
                }
                if (!(_vQuantifierResult_517_1)) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:517,1");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((1 < _vsPr))) throw new _xPre ("CheminementProgrammeSolution2_3.pd:519,5");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((_vsPr <= _vsF))) throw new _xPre ("CheminementProgrammeSolution2_3.pd:520,4");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((_vsF <= _jCheminementProgrammeSolution2_x5F_3._n_SessMaxE))) throw new _xPre
                    ("CheminementProgrammeSolution2_3.pd:521,4");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_523_3;
                {
                    _vQuantifierResult_523_3 = false;
                    int _vCaptureCount_c_523_16 = _vp.obligatoires._oHash ();
                    int _vLoopCounter_523_11 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_523_11 == _vCaptureCount_c_523_16) ||
                            _vQuantifierResult_523_3)) break;
                        _vQuantifierResult_523_3 = (!_vreussis._ovIn (_vp.obligatoires._oIndex (
                            _vLoopCounter_523_11)));
                        if (_vQuantifierResult_523_3)
                        {
                        }
                        else
                        {
                            _vLoopCounter_523_11 = _eSystem._oSucc (_vLoopCounter_523_11);
                        }
                    }
                }
                if (!((_vQuantifierResult_523_3 || ((_vp.optionnels._oStarStar (_vreussis, (
                    _eTemplate_0) null)._oHash () + _vp.obligatoires._oHash ()) <
                    _jCheminementProgrammeSolution2_x5F_3._n_NbCoursReussir)))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:523,3");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(_vreussis._oLessLessEq (_vp._n_Rep._nz_ListeDeCours (), (_eTemplate_0) null)))
                    throw new _xPre ("CheminementProgrammeSolution2_3.pd:526,9");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((!_vp.obligatoires._oPlusPlus (_vp.optionnels, (_eTemplate_0) null)._oStarStar
                    (_vreussis, (_eTemplate_0) null).empty ()))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:527,1");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(_vp.obligatoires._oPlusPlus (_vp.optionnels, (_eTemplate_0) null)._lEqual (
                    _vsess.dom ()))) throw new _xPre ("CheminementProgrammeSolution2_3.pd:528,31");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!(_vp.obligatoires._oPlusPlus (_vp.optionnels, (_eTemplate_0) null)._lEqual (
                    _vproj.dom ()))) throw new _xPre ("CheminementProgrammeSolution2_3.pd:529,31");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((50 <= (_vp.obligatoires._oHash () + _vp.optionnels._oHash ())))) throw new
                    _xPre ("CheminementProgrammeSolution2_3.pd:531,32");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_532_1;
                {
                    _eSet _vCaptureBound_c_532_13 = _vp._nz_CoursDuProgramme ();
                    _vQuantifierResult_532_1 = true;
                    int _vCaptureCount_c_532_13 = _vCaptureBound_c_532_13._oHash ();
                    int _vLoopCounter_532_8 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_532_8 == _vCaptureCount_c_532_13) || (!
                            _vQuantifierResult_532_1))) break;
                        _vQuantifierResult_532_1 = (_vsess.dom ()._ovIn (_vCaptureBound_c_532_13.
                            _oIndex (_vLoopCounter_532_8)) && _vproj.dom ()._ovIn (
                            _vCaptureBound_c_532_13._oIndex (_vLoopCounter_532_8)));
                        if ((!_vQuantifierResult_532_1))
                        {
                        }
                        else
                        {
                            _vLoopCounter_532_8 = _eSystem._oSucc (_vLoopCounter_532_8);
                        }
                    }
                }
                if (!(_vQuantifierResult_532_1)) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:532,1");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                _eSet _vThose_538_4 = new _eSet ();
                {
                    _eSet _vCaptureBound_c_538_14 = _vp.obligatoires._oPlusPlus (_vp.optionnels, (
                        _eTemplate_0) null);
                    int _vCaptureCount_c_538_14 = _vCaptureBound_c_538_14._oHash ();
                    int _vLoopCounter_538_11 = 0;
                    for (;;)
                    {
                        if ((_vLoopCounter_538_11 == _vCaptureCount_c_538_14)) break;
                        if (_vp._n_Rep.prealables (((Cours) _vCaptureBound_c_538_14._oIndex (
                            _vLoopCounter_538_11)).value, (Cours) null).empty ())
                        {
                            _vThose_538_4 = _vThose_538_4.append (_vCaptureBound_c_538_14._oIndex (
                                _vLoopCounter_538_11));
                        }
                        else
                        {
                        }
                        _vLoopCounter_538_11 = _eSystem._oSucc (_vLoopCounter_538_11);
                    }
                }
                if (!((10 <= _vThose_538_4._oHash ()))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:539,34");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                _eSet _vThose_554_3 = new _eSet ();
                {
                    int _vCaptureCount_c_554_15 = _vp.obligatoires._oHash ();
                    int _vLoopCounter_554_10 = 0;
                    for (;;)
                    {
                        if ((_vLoopCounter_554_10 == _vCaptureCount_c_554_15)) break;
                        if (((_eWrapper_bool) _vproj._oIndex (_vp.obligatoires._oIndex (
                            _vLoopCounter_554_10))).value)
                        {
                            _vThose_554_3 = _vThose_554_3.append (_vp.obligatoires._oIndex (
                                _vLoopCounter_554_10));
                        }
                        else
                        {
                        }
                        _vLoopCounter_554_10 = _eSystem._oSucc (_vLoopCounter_554_10);
                    }
                }
                if (!((_vThose_554_3._oHash () <= 3))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:554,40");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        reussis = _vreussis;
        p = _vp;
        sPr = _vsPr;
        sF = _vsF;
        sess = _vsess;
        proj = _vproj;
        chemP = cP;
        chemOk = cOk;
        _lc_VerifChemPers ("CheminementProgrammeSolution2_3.pd:563,1");
    }

    public boolean verifChoixPS (_eSet prochaineS, Cours _t0prochaineS, _eSet r, Cours _t0r, int sCr)
    {
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:568,1");
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((sPr <= sCr))) throw new _xPre ("CheminementProgrammeSolution2_3.pd:571,5");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((sCr <= sF))) throw new _xPre ("CheminementProgrammeSolution2_3.pd:572,5");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        boolean _vCondResult_575_54;
        if ((p.obligatoires._oLessLessEq (r, (_eTemplate_0) null) && (
            _jCheminementProgrammeSolution2_x5F_3._n_NbCoursReussir <= (p.optionnels._oStarStar (r,
            (_eTemplate_0) null)._oHash () + p.obligatoires._oHash ()))))
        {
            _vCondResult_575_54 = true;
        }
        else
        {
            boolean _vCondResult_578_44;
            if (((r._oLessLessEq (p._n_Rep._nz_ListeDeCours (), (_eTemplate_0) null) && (!r.empty ())
                ) && (!p.obligatoires._oPlusPlus (p.optionnels, (_eTemplate_0) null)._oStarStar (r,
                (_eTemplate_0) null).empty ())))
            {
                boolean _vQuantifierResult_579_1;
                {
                    _vQuantifierResult_579_1 = true;
                    int _vCaptureCount_c_579_12 = prochaineS._oHash ();
                    int _vLoopCounter_579_9 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_579_9 == _vCaptureCount_c_579_12) || (!
                            _vQuantifierResult_579_1))) break;
                        _vQuantifierResult_579_1 = sess.dom ()._ovIn (prochaineS._oIndex (
                            _vLoopCounter_579_9));
                        if ((!_vQuantifierResult_579_1))
                        {
                        }
                        else
                        {
                            _vLoopCounter_579_9 = _eSystem._oSucc (_vLoopCounter_579_9);
                        }
                    }
                }
                _vCondResult_578_44 = _vQuantifierResult_579_1;
            }
            else
            {
                _vCondResult_578_44 = false;
            }
            boolean _vCondResult_579_41;
            if (_vCondResult_578_44)
            {
                boolean _vQuantifierResult_580_1;
                {
                    _vQuantifierResult_580_1 = true;
                    int _vCaptureCount_c_580_12 = prochaineS._oHash ();
                    int _vLoopCounter_580_9 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_580_9 == _vCaptureCount_c_580_12) || (!
                            _vQuantifierResult_580_1))) break;
                        _vQuantifierResult_580_1 = proj.dom ()._ovIn (prochaineS._oIndex (
                            _vLoopCounter_580_9));
                        if ((!_vQuantifierResult_580_1))
                        {
                        }
                        else
                        {
                            _vLoopCounter_580_9 = _eSystem._oSucc (_vLoopCounter_580_9);
                        }
                    }
                }
                _vCondResult_579_41 = _vQuantifierResult_580_1;
            }
            else
            {
                _vCondResult_579_41 = false;
            }
            boolean _vCondResult_580_41;
            if (_vCondResult_579_41)
            {
                boolean _vQuantifierResult_581_1;
                {
                    _vQuantifierResult_581_1 = true;
                    int _vCaptureCount_c_581_12 = prochaineS._oHash ();
                    int _vLoopCounter_581_9 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_581_9 == _vCaptureCount_c_581_12) || (!
                            _vQuantifierResult_581_1))) break;
                        _vQuantifierResult_581_1 = p.obligatoires._oPlusPlus (p.optionnels, (
                            _eTemplate_0) null)._ovIn (prochaineS._oIndex (_vLoopCounter_581_9));
                        if ((!_vQuantifierResult_581_1))
                        {
                        }
                        else
                        {
                            _vLoopCounter_581_9 = _eSystem._oSucc (_vLoopCounter_581_9);
                        }
                    }
                }
                _vCondResult_580_41 = _vQuantifierResult_581_1;
            }
            else
            {
                _vCondResult_580_41 = false;
            }
            boolean _vCondResult_583_21;
            if (((_vCondResult_580_41 && (prochaineS._oHash () <= 5)) && (!prochaineS.empty ())))
            {
                boolean _vQuantifierResult_584_1;
                {
                    _vQuantifierResult_584_1 = true;
                    int _vCaptureCount_c_584_12 = prochaineS._oHash ();
                    int _vLoopCounter_584_9 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_584_9 == _vCaptureCount_c_584_12) || (!
                            _vQuantifierResult_584_1))) break;
                        _vQuantifierResult_584_1 = (!r._ovIn (prochaineS._oIndex (
                            _vLoopCounter_584_9)));
                        if ((!_vQuantifierResult_584_1))
                        {
                        }
                        else
                        {
                            _vLoopCounter_584_9 = _eSystem._oSucc (_vLoopCounter_584_9);
                        }
                    }
                }
                _vCondResult_583_21 = _vQuantifierResult_584_1;
            }
            else
            {
                _vCondResult_583_21 = false;
            }
            boolean _vCondResult_584_35;
            if (_vCondResult_583_21)
            {
                boolean _vQuantifierResult_585_1;
                {
                    _vQuantifierResult_585_1 = true;
                    int _vCaptureCount_c_585_12 = prochaineS._oHash ();
                    int _vLoopCounter_585_9 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_585_9 == _vCaptureCount_c_585_12) || (!
                            _vQuantifierResult_585_1))) break;
                        boolean _vCondResult_586_1;
                        if (p._n_Rep.prealables (((Cours) prochaineS._oIndex (_vLoopCounter_585_9)).
                            value, (Cours) null).empty ())
                        {
                            _vCondResult_586_1 = true;
                        }
                        else
                        {
                            boolean _vQuantifierResult_587_4;
                            {
                                _eSet _vCaptureBound_cp_587_22 = p._n_Rep.prealables (((Cours)
                                    prochaineS._oIndex (_vLoopCounter_585_9)).value, (Cours) null);
                                _vQuantifierResult_587_4 = true;
                                int _vCaptureCount_cp_587_22 = _vCaptureBound_cp_587_22._oHash ();
                                int _vLoopCounter_587_12 = 0;
                                for (;;)
                                {
                                    if (((_vLoopCounter_587_12 == _vCaptureCount_cp_587_22) || (!
                                        _vQuantifierResult_587_4))) break;
                                    _vQuantifierResult_587_4 = r._ovIn (_vCaptureBound_cp_587_22.
                                        _oIndex (_vLoopCounter_587_12));
                                    if ((!_vQuantifierResult_587_4))
                                    {
                                    }
                                    else
                                    {
                                        _vLoopCounter_587_12 = _eSystem._oSucc (_vLoopCounter_587_12)
                                            ;
                                    }
                                }
                            }
                            _vCondResult_586_1 = _vQuantifierResult_587_4;
                        }
                        _vQuantifierResult_585_1 = _vCondResult_586_1;
                        if ((!_vQuantifierResult_585_1))
                        {
                        }
                        else
                        {
                            _vLoopCounter_585_9 = _eSystem._oSucc (_vLoopCounter_585_9);
                        }
                    }
                }
                _vCondResult_584_35 = _vQuantifierResult_585_1;
            }
            else
            {
                _vCondResult_584_35 = false;
            }
            boolean _vCondResult_588_4;
            if (_vCondResult_584_35)
            {
                boolean _vQuantifierResult_590_1;
                {
                    _vQuantifierResult_590_1 = true;
                    int _vCaptureCount_c_590_12 = prochaineS._oHash ();
                    int _vLoopCounter_590_9 = 0;
                    for (;;)
                    {
                        if (((_vLoopCounter_590_9 == _vCaptureCount_c_590_12) || (!
                            _vQuantifierResult_590_1))) break;
                        _vQuantifierResult_590_1 = ((3 == ((_eWrapper_int) sess._oIndex (prochaineS.
                            _oIndex (_vLoopCounter_590_9))).value) || (_eSystem._oMod (((
                            _eWrapper_int) sess._oIndex (prochaineS._oIndex (_vLoopCounter_590_9))).
                            value, 2) == _eSystem._oMod (sCr, 2)));
                        if ((!_vQuantifierResult_590_1))
                        {
                        }
                        else
                        {
                            _vLoopCounter_590_9 = _eSystem._oSucc (_vLoopCounter_590_9);
                        }
                    }
                }
                _vCondResult_588_4 = _vQuantifierResult_590_1;
            }
            else
            {
                _vCondResult_588_4 = false;
            }
            boolean _vCondResult_576_1;
            if (_vCondResult_588_4)
            {
                _eSet _vThose_593_3 = new _eSet ();
                {
                    int _vCaptureCount_c_593_13 = prochaineS._oHash ();
                    int _vLoopCounter_593_10 = 0;
                    for (;;)
                    {
                        if ((_vLoopCounter_593_10 == _vCaptureCount_c_593_13)) break;
                        if ((((_eWrapper_bool) proj._oIndex (prochaineS._oIndex (
                            _vLoopCounter_593_10))).value && p.obligatoires._ovIn (prochaineS.
                            _oIndex (_vLoopCounter_593_10))))
                        {
                            _vThose_593_3 = _vThose_593_3.append (prochaineS._oIndex (
                                _vLoopCounter_593_10));
                        }
                        else
                        {
                        }
                        _vLoopCounter_593_10 = _eSystem._oSucc (_vLoopCounter_593_10);
                    }
                }
                _vCondResult_576_1 = (_vThose_593_3._oHash () <= 1);
            }
            else
            {
                _vCondResult_576_1 = false;
            }
            _vCondResult_575_54 = _vCondResult_576_1;
        }
        return _vCondResult_575_54;
    }

    public _eSet simulReussis (int s, _eMap cp, int _t0cp, _eSet _t1cp, Cours _t2cp)
    {
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:600,1");
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                boolean _vQuantifierResult_603_4;
                {
                    _vQuantifierResult_603_4 = true;
                    int _vLoopCounter_603_11 = sPr;
                    for (;;)
                    {
                        if (((sF < _vLoopCounter_603_11) || (!_vQuantifierResult_603_4))) break;
                        if (_eSystem.enableConstraint && _eSystem.currentCheckNesting <= _eSystem.
                            maxCheckNesting)
                        {
                            _eSystem.currentCheckNesting ++;
                            try
                            {
                                if (!(_eSystem._oRange (1, _jCheminementProgrammeSolution2_x5F_3.
                                    _n_SessMaxE)._ovIn (((_eAny) new _eWrapper_int (
                                    _vLoopCounter_603_11))))) throw new _xConstraint (
                                    "CheminementProgrammeSolution2_3.pd:56,23");
                            }
                            catch (_xCannotEvaluate _lException)
                            {
                            }
                            _eSystem.currentCheckNesting --;
                        }
                        _vQuantifierResult_603_4 = cp.dom ()._ovIn (((_eAny) new _eWrapper_int (
                            _vLoopCounter_603_11)));
                        if ((!_vQuantifierResult_603_4))
                        {
                        }
                        else
                        {
                            _vLoopCounter_603_11 = _eSystem._oSucc (_vLoopCounter_603_11);
                        }
                    }
                }
                if (!(_vQuantifierResult_603_4)) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:603,4");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((s <= sF))) throw new _xPre ("CheminementProgrammeSolution2_3.pd:604,6");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((sPr <= s))) throw new _xPre ("CheminementProgrammeSolution2_3.pd:605,6");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        _eSeq _vForYield_607_13 = new _eSeq ();
        {
            int _vLoopCounter_607_18 = sF;
            for (;;)
            {
                if ((s < _vLoopCounter_607_18)) break;
                if (_eSystem.enableConstraint && _eSystem.currentCheckNesting <= _eSystem.
                    maxCheckNesting)
                {
                    _eSystem.currentCheckNesting ++;
                    try
                    {
                        if (!(_eSystem._oRange (1, _jCheminementProgrammeSolution2_x5F_3._n_SessMaxE)
                            ._ovIn (((_eAny) new _eWrapper_int (_vLoopCounter_607_18))))) throw new
                            _xConstraint ("CheminementProgrammeSolution2_3.pd:56,23");
                    }
                    catch (_xCannotEvaluate _lException)
                    {
                    }
                    _eSystem.currentCheckNesting --;
                }
                _vForYield_607_13 = _vForYield_607_13.append (cp._oIndex (((_eAny) new _eWrapper_int
                    (_vLoopCounter_607_18))));
                _vLoopCounter_607_18 = _eSystem._oSucc (_vLoopCounter_607_18);
            }
        }
        _eSet _vOver_607_4 = new _eSet ();
        {
            int _vLoopCounter_607_4 = 0;
            for (;;)
            {
                if ((_vForYield_607_13._oHash () == _vLoopCounter_607_4)) break;
                _vOver_607_4 = ((_eSet) _vOver_607_4._lClone ());
                _vOver_607_4._osPlusPlus (((_eSet) _vForYield_607_13._oIndex (_vLoopCounter_607_4)),
                    (_eTemplate_0) null);
                _vLoopCounter_607_4 = _eSystem._oSucc (_vLoopCounter_607_4);
            }
        }
        return reussis._oPlusPlus (_vOver_607_4, (_eTemplate_0) null);
    }

    public void _nz_VerifierCheminPer ()
    {
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:610,9");
        if (_eSystem.enablePre && _eSystem.currentCheckNesting <= _eSystem.maxCheckNesting)
        {
            _eSystem.currentCheckNesting ++;
            try
            {
                if (!((sPr <= _jCheminementProgrammeSolution2_x5F_3._n_SessMaxE))) throw new _xPre (
                    "CheminementProgrammeSolution2_3.pd:612,8");
            }
            catch (_xCannotEvaluate _lException)
            {
            }
            _eSystem.currentCheckNesting --;
        }
        {
            int _vLoopCounter_615_10 = sPr;
            for (;;)
            {
                if ((sF < _vLoopCounter_615_10)) break;
                if ((sPr == _vLoopCounter_615_10))
                {
                    if (_eSystem.enableConstraint && _eSystem.currentCheckNesting <= _eSystem.
                        maxCheckNesting)
                    {
                        _eSystem.currentCheckNesting ++;
                        try
                        {
                            if (!(_eSystem._oRange (1, _jCheminementProgrammeSolution2_x5F_3.
                                _n_SessMaxE)._ovIn (((_eAny) new _eWrapper_int (_vLoopCounter_615_10)
                                )))) throw new _xConstraint (
                                "CheminementProgrammeSolution2_3.pd:56,23");
                        }
                        catch (_xCannotEvaluate _lException)
                        {
                        }
                        _eSystem.currentCheckNesting --;
                    }
                    if (_eSystem.enableConstraint && _eSystem.currentCheckNesting <= _eSystem.
                        maxCheckNesting)
                    {
                        _eSystem.currentCheckNesting ++;
                        try
                        {
                            if (!(_eSystem._oRange (1, _jCheminementProgrammeSolution2_x5F_3.
                                _n_SessMaxE)._ovIn (((_eAny) new _eWrapper_int (_vLoopCounter_615_10)
                                )))) throw new _xConstraint (
                                "CheminementProgrammeSolution2_3.pd:56,23");
                        }
                        catch (_xCannotEvaluate _lException)
                        {
                        }
                        _eSystem.currentCheckNesting --;
                    }
                    _eMap _vUnshare_619_5 = ((_eMap) chemOk._lClone ());
                    chemOk = _vUnshare_619_5;
                    _vUnshare_619_5._oaIndex (((_eAny) new _eWrapper_int (_vLoopCounter_615_10)), ((
                        _eAny) new _eWrapper_bool (verifChoixPS (((_eSet) chemP._oIndex (((_eAny)
                        new _eWrapper_int (_vLoopCounter_615_10)))), (Cours) null, reussis, (Cours)
                        null, sPr))));
                }
                else if (((sPr < _vLoopCounter_615_10) && (_vLoopCounter_615_10 <= sF)))
                {
                    if (_eSystem.enableConstraint && _eSystem.currentCheckNesting <= _eSystem.
                        maxCheckNesting)
                    {
                        _eSystem.currentCheckNesting ++;
                        try
                        {
                            if (!(_eSystem._oRange (1, _jCheminementProgrammeSolution2_x5F_3.
                                _n_SessMaxE)._ovIn (((_eAny) new _eWrapper_int (_vLoopCounter_615_10)
                                )))) throw new _xConstraint (
                                "CheminementProgrammeSolution2_3.pd:56,23");
                        }
                        catch (_xCannotEvaluate _lException)
                        {
                        }
                        _eSystem.currentCheckNesting --;
                    }
                    if (_eSystem.enableConstraint && _eSystem.currentCheckNesting <= _eSystem.
                        maxCheckNesting)
                    {
                        _eSystem.currentCheckNesting ++;
                        try
                        {
                            if (!(_eSystem._oRange (1, _jCheminementProgrammeSolution2_x5F_3.
                                _n_SessMaxE)._ovIn (((_eAny) new _eWrapper_int (_vLoopCounter_615_10)
                                )))) throw new _xConstraint (
                                "CheminementProgrammeSolution2_3.pd:56,23");
                        }
                        catch (_xCannotEvaluate _lException)
                        {
                        }
                        _eSystem.currentCheckNesting --;
                    }
                    int _vCaptureConstraintCheck_624_19 = (_vLoopCounter_615_10 - 1);
                    if (_eSystem.enableConstraint && _eSystem.currentCheckNesting <= _eSystem.
                        maxCheckNesting)
                    {
                        _eSystem.currentCheckNesting ++;
                        try
                        {
                            if (!(_eSystem._oRange (1, _jCheminementProgrammeSolution2_x5F_3.
                                _n_SessMaxE)._ovIn (((_eAny) new _eWrapper_int (
                                _vCaptureConstraintCheck_624_19))))) throw new _xConstraint (
                                "CheminementProgrammeSolution2_3.pd:56,23");
                        }
                        catch (_xCannotEvaluate _lException)
                        {
                        }
                        _eSystem.currentCheckNesting --;
                    }
                    if (_eSystem.enableConstraint && _eSystem.currentCheckNesting <= _eSystem.
                        maxCheckNesting)
                    {
                        _eSystem.currentCheckNesting ++;
                        try
                        {
                            if (!(_eSystem._oRange (1, _jCheminementProgrammeSolution2_x5F_3.
                                _n_SessMaxE)._ovIn (((_eAny) new _eWrapper_int (_vLoopCounter_615_10)
                                )))) throw new _xConstraint (
                                "CheminementProgrammeSolution2_3.pd:56,23");
                        }
                        catch (_xCannotEvaluate _lException)
                        {
                        }
                        _eSystem.currentCheckNesting --;
                    }
                    _eMap _vUnshare_622_9 = ((_eMap) chemOk._lClone ());
                    chemOk = _vUnshare_622_9;
                    _vUnshare_622_9._oaIndex (((_eAny) new _eWrapper_int (_vLoopCounter_615_10)), ((
                        _eAny) new _eWrapper_bool (verifChoixPS (((_eSet) chemP._oIndex (((_eAny)
                        new _eWrapper_int (_vLoopCounter_615_10)))), (Cours) null, simulReussis (
                        _vCaptureConstraintCheck_624_19, chemP, (int) 0, (_eSet) null, (Cours) null),
                        (Cours) null, _vLoopCounter_615_10))));
                }
                else throw new _xNoChoice ("CheminementProgrammeSolution2_3.pd:621,11");
                _vLoopCounter_615_10 = _eSystem._oSucc (_vLoopCounter_615_10);
            }
        }
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:615,3");
    }

    public boolean _nz_ToutVerifier ()
    {
        _lClassInvariantCheck ("CheminementProgrammeSolution2_3.pd:628,1");
        boolean _vQuantifierResult_630_1;
        {
            _vQuantifierResult_630_1 = true;
            int _vLoopCounter_630_8 = sPr;
            for (;;)
            {
                if (((sF < _vLoopCounter_630_8) || (!_vQuantifierResult_630_1))) break;
                if (_eSystem.enableConstraint && _eSystem.currentCheckNesting <= _eSystem.
                    maxCheckNesting)
                {
                    _eSystem.currentCheckNesting ++;
                    try
                    {
                        if (!(_eSystem._oRange (1, _jCheminementProgrammeSolution2_x5F_3._n_SessMaxE)
                            ._ovIn (((_eAny) new _eWrapper_int (_vLoopCounter_630_8))))) throw new
                            _xConstraint ("CheminementProgrammeSolution2_3.pd:56,23");
                    }
                    catch (_xCannotEvaluate _lException)
                    {
                    }
                    _eSystem.currentCheckNesting --;
                }
                _vQuantifierResult_630_1 = (((_eWrapper_bool) chemOk._oIndex (((_eAny) new
                    _eWrapper_int (_vLoopCounter_630_8)))).value && ((
                    _jCheminementProgrammeSolution2_x5F_3._n_SessMaxE == sF) || ((40 <= p.
                    obligatoires._oPlusPlus (p.optionnels, (_eTemplate_0) null)._oStarStar (reussis.
                    _oPlusPlus (simulReussis (sF, chemP, (int) 0, (_eSet) null, (Cours) null), (
                    _eTemplate_0) null), (_eTemplate_0) null)._oHash ()) && p.obligatoires.
                    _oLessLessEq (reussis._oPlusPlus (simulReussis (sF, chemP, (int) 0, (_eSet) null,
                    (Cours) null), (_eTemplate_0) null), (_eTemplate_0) null))));
                if ((!_vQuantifierResult_630_1))
                {
                }
                else
                {
                    _vLoopCounter_630_8 = _eSystem._oSucc (_vLoopCounter_630_8);
                }
            }
        }
        return _vQuantifierResult_630_1;
    }

    public boolean _lEqual (VerifChemPers _vArg_440_1)
    {
        if (this == _vArg_440_1)
        {
            return true;
        }
        _lc_VerifChemPers ("CheminementProgrammeSolution2_3.pd:440,1");
        return ((((((((_vArg_440_1.sPr == sPr) && (_vArg_440_1.sF == sF)) && _vArg_440_1.reussis.
            _lEqual (reussis)) && _vArg_440_1.chemP._lEqual (chemP)) && _vArg_440_1.chemOk._lEqual (
            chemOk)) && _vArg_440_1.p._lEqual (p)) && _vArg_440_1.sess._lEqual (sess)) &&
            _vArg_440_1.proj._lEqual (proj));
    }

    public boolean equals (_eAny _lArg)
    {
        return _lArg == this || (_lArg != null && _lArg.getClass () == VerifChemPers.class &&
            _lEqual ((VerifChemPers) _lArg));
    }

}

final class _jCheminementProgrammeSolution2_x5F_3
{
    private static boolean _li_CoursVide = false;
    private static _eSet _vConstValue_30_3;
    public static _eSet _n_CoursVide ()
    {
        if (!_li_CoursVide)
        {
            _vConstValue_30_3 = new _eSet ();
            _li_CoursVide = true;
        }
        return _vConstValue_30_3;
    }

    public final static int _n_NbCoursReussir = 40;
    public final static int _n_NiveauMin = 1;
    public final static int _n_NiveauMax = 4;
    public final static int _n_MinObligatoires = 25;
    public final static int _n_MaxObligatoires = 30;
    public final static int _n_MinOptionnels = 16;
    public final static int _n_SessMax = 8;
    public final static int _n_SessMaxE = 16;
    public final static int _n_MaxCrSession = 5;
}


// End of file.
