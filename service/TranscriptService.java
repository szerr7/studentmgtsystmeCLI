package edu.miu.cs.cs425.mystudentmgmtapp.service;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Transcript;
import edu.miu.cs.cs425.mystudentmgmtapp.repository.TranscriptRepository;



public interface TranscriptService  {

    Transcript saveTranscript(Transcript newTranscript)  ;
    Transcript getTranscriptById(Integer transcriptId);



}
