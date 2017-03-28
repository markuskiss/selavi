package de.filiadata.datahub.business.bitbucket;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BitbucketCommitterDto {
    private BitbucketAuthorDto author;

}
