package com.eagle6.gateway.repository;

import com.eagle6.gateway.domain.Authority;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * Spring Data Neo4j repository for the Authority entity.
 */
public interface AuthorityRepository extends Neo4jRepository<Authority, String> {
}
