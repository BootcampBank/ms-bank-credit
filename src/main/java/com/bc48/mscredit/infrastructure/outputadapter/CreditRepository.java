package com.bc48.mscredit.infrastructure.outputadapter;

import com.bc48.mscredit.domain.documents.Credit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CreditRepository extends ReactiveMongoRepository<Credit,String> {




}
