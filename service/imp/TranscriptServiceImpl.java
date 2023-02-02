package edu.miu.cs.cs425.mystudentmgmtapp.service.imp;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Transcript;
import edu.miu.cs.cs425.mystudentmgmtapp.repository.TranscriptRepository;
import edu.miu.cs.cs425.mystudentmgmtapp.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TranscriptServiceImpl implements TranscriptService {

    @Autowired
    private TranscriptRepository transcriptRepository ;



    @Override
    public Transcript saveTranscript(Transcript newTranscript) {
        return transcriptRepository.save(newTranscript);
    }

    @Override
    public Transcript getTranscriptById(Integer transcriptId) {
        return transcriptRepository.findById(transcriptId).orElse(null);
    }
}
