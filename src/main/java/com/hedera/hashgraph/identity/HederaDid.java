package com.hedera.hashgraph.identity;

import com.hedera.hashgraph.identity.DidSyntax.Method;

/**
 * Hedera Decentralized Identifier.
 */
public interface HederaDid {

  /**
   * Parses the given DID string into a {@link HederaDid} object.
   *
   * @param didString The DID.
   * @return {@link HederaDid} object.
   */
  static HederaDid fromString(final String didString) {
    return DidParser.parse(didString);
  }

  /**
   * Converts the {@link HederaDid} object into a DID string.
   *
   * @return The DID string.
   */
  String toDid();

  /**
   * Generates a basic DID document for this identity.
   *
   * @return The DID document as a {@link DidDocumentBase}.
   */
  DidDocumentBase generateDidDocument();

  /**
   * Returns a {@link String} for which the DID is created.
   *
   * @return A Hedera network for which the DID is created.
   */
  String getNetwork();

  /**
   * Returns a DID method of this DID.
   *
   * @return A DID method.
   */
  Method getMethod();
}
